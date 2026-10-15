package W2;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2027o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f2028p;

    public /* synthetic */ d(l lVar, int i4) {
        this.f2027o = i4;
        this.f2028p = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        int i4 = this.f2027o;
        l lVar = this.f2028p;
        switch (i4) {
            case 0:
                if (lVar.c == null || (context = lVar.f2044b) == null) {
                    return;
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                int i5 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                k kVar = lVar.c;
                kVar.getLocationOnScreen(iArr);
                int height = (i5 - (kVar.getHeight() + iArr[1])) + ((int) lVar.c.getTranslationY());
                if (height >= lVar.f2051k) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = lVar.c.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(l.f2042p, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (lVar.f2051k - height) + marginLayoutParams.bottomMargin;
                lVar.c.requestLayout();
                return;
            default:
                k kVar2 = lVar.c;
                if (kVar2 == null) {
                    return;
                }
                kVar2.setVisibility(0);
                if (kVar2.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setInterpolator(C2.a.f507a);
                    ofFloat.addUpdateListener(new b(lVar, 0, (byte) 0));
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                    ofFloat2.setInterpolator(C2.a.d);
                    ofFloat2.addUpdateListener(new b(lVar, 1, (byte) 0));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofFloat, ofFloat2);
                    animatorSet.setDuration(150L);
                    animatorSet.addListener(new a(lVar, 0));
                    animatorSet.start();
                    return;
                }
                int height2 = kVar2.getHeight();
                ViewGroup.LayoutParams layoutParams2 = kVar2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                kVar2.setTranslationY(height2);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(height2, 0);
                valueAnimator.setInterpolator(C2.a.f508b);
                valueAnimator.setDuration(250L);
                valueAnimator.addListener(new a(lVar, 2));
                valueAnimator.addUpdateListener(new b(lVar, height2));
                valueAnimator.start();
                return;
        }
    }
}
