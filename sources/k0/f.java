package k0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f extends o {

    /* renamed from: J, reason: collision with root package name */
    public static final String[] f13510J = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: K, reason: collision with root package name */
    public static final C1752b f13511K;

    /* renamed from: L, reason: collision with root package name */
    public static final C1752b f13512L;

    /* renamed from: M, reason: collision with root package name */
    public static final C1752b f13513M;
    public static final C1752b N;

    /* renamed from: O, reason: collision with root package name */
    public static final C1752b f13514O;

    static {
        new C2.c(PointF.class, "boundsOrigin").f511b = new Rect();
        f13511K = new C1752b(PointF.class, "topLeft", 0);
        f13512L = new C1752b(PointF.class, "bottomRight", 1);
        f13513M = new C1752b(PointF.class, "bottomRight", 2);
        N = new C1752b(PointF.class, "topLeft", 3);
        f13514O = new C1752b(PointF.class, "position", 4);
    }

    public static void G(v vVar) {
        View view = vVar.f13562b;
        HashMap hashMap = vVar.f13561a;
        WeakHashMap weakHashMap = H.A.f779a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // k0.o
    public final void d(v vVar) {
        G(vVar);
    }

    @Override // k0.o
    public final void g(v vVar) {
        G(vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, k0.e] */
    @Override // k0.o
    public final Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        int i4;
        f fVar;
        ObjectAnimator ofObject;
        if (vVar != null) {
            HashMap hashMap = vVar.f13561a;
            if (vVar2 != null) {
                HashMap hashMap2 = vVar2.f13561a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = vVar2.f13562b;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i5 = rect.left;
                    int i6 = rect2.left;
                    int i7 = rect.top;
                    int i8 = rect2.top;
                    int i9 = rect.right;
                    int i10 = rect2.right;
                    int i11 = rect.bottom;
                    int i12 = rect2.bottom;
                    int i13 = i9 - i5;
                    int i14 = i11 - i7;
                    int i15 = i10 - i6;
                    int i16 = i12 - i8;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i13 == 0 || i14 == 0) && (i15 == 0 || i16 == 0)) {
                        i4 = 0;
                    } else {
                        i4 = (i5 == i6 && i7 == i8) ? 0 : 1;
                        if (i9 != i10 || i11 != i12) {
                            i4++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i4++;
                    }
                    int i17 = i4;
                    if (i17 > 0) {
                        w.a(view, i5, i7, i9, i11);
                        if (i17 != 2) {
                            fVar = this;
                            if (i5 == i6 && i7 == i8) {
                                fVar.f13537F.getClass();
                                ofObject = ObjectAnimator.ofObject(view, f13513M, (TypeConverter) null, C2033d.i(i9, i11, i10, i12));
                            } else {
                                fVar.f13537F.getClass();
                                ofObject = ObjectAnimator.ofObject(view, N, (TypeConverter) null, C2033d.i(i5, i7, i6, i8));
                            }
                        } else if (i13 == i15 && i14 == i16) {
                            fVar = this;
                            fVar.f13537F.getClass();
                            ofObject = ObjectAnimator.ofObject(view, f13514O, (TypeConverter) null, C2033d.i(i5, i7, i6, i8));
                        } else {
                            fVar = this;
                            ?? obj = new Object();
                            obj.f13507e = view;
                            fVar.f13537F.getClass();
                            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(obj, f13511K, (TypeConverter) null, C2033d.i(i5, i7, i6, i8));
                            fVar.f13537F.getClass();
                            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(obj, f13512L, (TypeConverter) null, C2033d.i(i9, i11, i10, i12));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofObject2, ofObject3);
                            animatorSet.addListener(new c(obj));
                            ofObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            android.support.v4.media.session.a.v(viewGroup4, true);
                            fVar.a(new d(viewGroup4));
                        }
                        return ofObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // k0.o
    public final String[] p() {
        return f13510J;
    }
}
