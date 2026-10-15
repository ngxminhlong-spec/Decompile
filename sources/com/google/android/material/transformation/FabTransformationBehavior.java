package com.google.android.material.transformation;

import C2.a;
import C2.b;
import C2.d;
import C2.e;
import H.A;
import H.AbstractC0044t;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f12538e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f12539f;

    /* renamed from: g, reason: collision with root package name */
    public float f12540g;

    /* renamed from: h, reason: collision with root package name */
    public float f12541h;

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.f12538e = new RectF();
        this.f12539f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.f12538e = new RectF();
        this.f12539f = new int[2];
    }

    public static Pair t(float f4, float f5, boolean z4, C0258Da c0258Da) {
        e d;
        e d4;
        if (f4 == 0.0f || f5 == 0.0f) {
            d = ((d) c0258Da.f4618p).d("translationXLinear");
            d4 = ((d) c0258Da.f4618p).d("translationYLinear");
        } else if ((!z4 || f5 >= 0.0f) && (z4 || f5 <= 0.0f)) {
            d = ((d) c0258Da.f4618p).d("translationXCurveDownwards");
            d4 = ((d) c0258Da.f4618p).d("translationYCurveDownwards");
        } else {
            d = ((d) c0258Da.f4618p).d("translationXCurveUpwards");
            d4 = ((d) c0258Da.f4618p).d("translationYCurveUpwards");
        }
        return new Pair(d, d4);
    }

    public static float w(C0258Da c0258Da, e eVar, float f4) {
        long j4 = eVar.f514a;
        long j5 = eVar.f515b;
        e d = ((d) c0258Da.f4618p).d("expansion");
        float interpolation = eVar.b().getInterpolation(((float) (((d.f514a + d.f515b) + 17) - j4)) / ((float) j5));
        LinearInterpolator linearInterpolator = a.f507a;
        return n0.a.g(0.0f, f4, interpolation, f4);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, v.AbstractC2018b
    public final boolean b(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // v.AbstractC2018b
    public final void c(v.e eVar) {
        if (eVar.f15001h == 0) {
            eVar.f15001h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet s(View view, View view2, boolean z4, boolean z5) {
        ObjectAnimator ofFloat;
        int i4;
        float f4;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ObjectAnimator ofFloat4;
        C0258Da y = y(view2.getContext(), z4);
        if (z4) {
            this.f12540g = view.getTranslationX();
            this.f12541h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        WeakHashMap weakHashMap = A.f779a;
        float d = AbstractC0044t.d(view2) - AbstractC0044t.d(view);
        if (z4) {
            if (!z5) {
                view2.setTranslationZ(-d);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -d);
        }
        ((d) y.f4618p).d("elevation").a(ofFloat);
        arrayList.add(ofFloat);
        float u2 = u(view, view2, (V2.e) y.f4619q);
        float v4 = v(view, view2, (V2.e) y.f4619q);
        Pair t4 = t(u2, v4, z4, y);
        e eVar = (e) t4.first;
        e eVar2 = (e) t4.second;
        RectF rectF = this.d;
        if (z4) {
            if (!z5) {
                view2.setTranslationX(-u2);
                view2.setTranslationY(-v4);
            }
            i4 = 0;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f4 = 0.0f;
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float w2 = w(y, eVar, -u2);
            float w4 = w(y, eVar2, -v4);
            Rect rect = this.c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.f12538e;
            x(view2, rectF2);
            rectF2.offset(w2, w4);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i4 = 0;
            f4 = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -u2);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -v4);
        }
        eVar.a(ofFloat2);
        eVar2.a(ofFloat3);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        rectF.width();
        rectF.height();
        float u4 = u(view, view2, (V2.e) y.f4619q);
        float v5 = v(view, view2, (V2.e) y.f4619q);
        Pair t5 = t(u4, v5, z4, y);
        e eVar3 = (e) t5.first;
        e eVar4 = (e) t5.second;
        Property property = View.TRANSLATION_X;
        if (!z4) {
            u4 = this.f12540g;
        }
        float[] fArr = new float[1];
        fArr[i4] = u4;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z4) {
            v5 = this.f12541h;
        }
        float[] fArr2 = new float[1];
        fArr2[i4] = v5;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        eVar3.a(ofFloat5);
        eVar4.a(ofFloat6);
        arrayList.add(ofFloat5);
        arrayList.add(ofFloat6);
        if (view2 instanceof ViewGroup) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = findViewById != null ? findViewById instanceof ViewGroup ? (ViewGroup) findViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z4) {
                    if (!z5) {
                        b.f509a.set(viewGroup, Float.valueOf(f4));
                    }
                    b bVar = b.f509a;
                    float[] fArr3 = new float[1];
                    fArr3[i4] = 1.0f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, bVar, fArr3);
                } else {
                    b bVar2 = b.f509a;
                    float[] fArr4 = new float[1];
                    fArr4[i4] = f4;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, bVar2, fArr4);
                }
                ((d) y.f4618p).d("contentFade").a(ofFloat4);
                arrayList.add(ofFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        B.E(animatorSet, arrayList);
        animatorSet.addListener(new a3.b(z4, view2, view));
        int size = arrayList2.size();
        for (int i5 = i4; i5 < size; i5++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i5));
        }
        return animatorSet;
    }

    public final float u(View view, View view2, V2.e eVar) {
        RectF rectF = this.d;
        x(view, rectF);
        rectF.offset(this.f12540g, this.f12541h);
        RectF rectF2 = this.f12538e;
        x(view2, rectF2);
        eVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float v(View view, View view2, V2.e eVar) {
        RectF rectF = this.d;
        x(view, rectF);
        rectF.offset(this.f12540g, this.f12541h);
        RectF rectF2 = this.f12538e;
        x(view2, rectF2);
        eVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void x(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f12539f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract C0258Da y(Context context, boolean z4);
}
