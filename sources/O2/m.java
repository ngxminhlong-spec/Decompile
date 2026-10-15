package O2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m extends k {
    @Override // O2.k
    public final float d() {
        return this.f1464u.getElevation();
    }

    @Override // O2.k
    public final void e(Rect rect) {
        if (((FloatingActionButton) this.f1465v.f15212p).y) {
            super.e(rect);
            return;
        }
        if (this.f1449f) {
            FloatingActionButton floatingActionButton = this.f1464u;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i4 = this.f1454k;
            if (sizeDimension < i4) {
                int sizeDimension2 = (i4 - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // O2.k
    public final void f(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i4) {
        Drawable drawable;
        V2.k kVar = this.f1446a;
        kVar.getClass();
        V2.g gVar = new V2.g(kVar);
        this.f1447b = gVar;
        gVar.setTintList(colorStateList);
        if (mode != null) {
            this.f1447b.setTintMode(mode);
        }
        V2.g gVar2 = this.f1447b;
        FloatingActionButton floatingActionButton = this.f1464u;
        gVar2.g(floatingActionButton.getContext());
        if (i4 > 0) {
            Context context = floatingActionButton.getContext();
            V2.k kVar2 = this.f1446a;
            kVar2.getClass();
            b bVar = new b(kVar2);
            int color = context.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context.getColor(R.color.design_fab_stroke_end_outer_color);
            bVar.f1418i = color;
            bVar.f1419j = color2;
            bVar.f1420k = color3;
            bVar.f1421l = color4;
            float f4 = i4;
            if (bVar.f1417h != f4) {
                bVar.f1417h = f4;
                bVar.f1413b.setStrokeWidth(f4 * 1.3333f);
                bVar.f1423n = true;
                bVar.invalidateSelf();
            }
            if (colorStateList != null) {
                bVar.f1422m = colorStateList.getColorForState(bVar.getState(), bVar.f1422m);
            }
            bVar.f1425p = colorStateList;
            bVar.f1423n = true;
            bVar.invalidateSelf();
            this.d = bVar;
            b bVar2 = this.d;
            bVar2.getClass();
            V2.g gVar3 = this.f1447b;
            gVar3.getClass();
            drawable = new LayerDrawable(new Drawable[]{bVar2, gVar3});
        } else {
            this.d = null;
            drawable = this.f1447b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(T2.a.a(colorStateList2), drawable, null);
        this.c = rippleDrawable;
        this.f1448e = rippleDrawable;
    }

    @Override // O2.k
    public final void g() {
    }

    @Override // O2.k
    public final void h() {
        p();
    }

    @Override // O2.k
    public final void i(int[] iArr) {
    }

    @Override // O2.k
    public final void j(float f4, float f5, float f6) {
        int i4 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(k.f1439C, q(f4, f6));
        stateListAnimator.addState(k.f1440D, q(f4, f5));
        stateListAnimator.addState(k.f1441E, q(f4, f5));
        stateListAnimator.addState(k.f1442F, q(f4, f5));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float[] fArr = {f4};
        FloatingActionButton floatingActionButton = this.f1464u;
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L));
        if (i4 <= 24) {
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(k.f1438B);
        stateListAnimator.addState(k.f1443G, animatorSet);
        stateListAnimator.addState(k.f1444H, q(0.0f, 0.0f));
        floatingActionButton.setStateListAnimator(stateListAnimator);
        if (n()) {
            p();
        }
    }

    @Override // O2.k
    public final void l(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(T2.a.a(colorStateList));
        } else {
            super.l(colorStateList);
        }
    }

    @Override // O2.k
    public final boolean n() {
        if (((FloatingActionButton) this.f1465v.f15212p).y) {
            return true;
        }
        return this.f1449f && this.f1464u.getSizeDimension() < this.f1454k;
    }

    @Override // O2.k
    public final void o() {
    }

    public final AnimatorSet q(float f4, float f5) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f4};
        FloatingActionButton floatingActionButton = this.f1464u;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f5).setDuration(100L));
        animatorSet.setInterpolator(k.f1438B);
        return animatorSet;
    }
}
