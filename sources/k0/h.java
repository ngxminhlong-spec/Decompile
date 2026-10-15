package k0;

import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.gms.internal.ads.D9;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h extends o {

    /* renamed from: K, reason: collision with root package name */
    public static final String[] f13517K = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: J, reason: collision with root package name */
    public final int f13518J;

    public h(int i4) {
        this.f13518J = i4;
    }

    public static void G(v vVar) {
        View view = vVar.f13562b;
        int visibility = view.getVisibility();
        HashMap hashMap = vVar.f13561a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.D9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.D9 I(k0.v r8, k0.v r9) {
        /*
            com.google.android.gms.internal.ads.D9 r0 = new com.google.android.gms.internal.ads.D9
            r0.<init>()
            r1 = 0
            r0.f4588a = r1
            r0.f4589b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f13561a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f4590e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.f4590e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f13561a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f4591f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f4591f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L92
            if (r9 == 0) goto L92
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L6c
            java.lang.Object r3 = r0.f4590e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r0.f4591f
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 != r4) goto L6c
            goto La7
        L6c:
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L75
            r0.f4589b = r1
            r0.f4588a = r2
            return r0
        L75:
            if (r9 != 0) goto La7
            r0.f4589b = r2
            r0.f4588a = r2
            return r0
        L7c:
            java.lang.Object r8 = r0.f4591f
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto L87
            r0.f4589b = r1
            r0.f4588a = r2
            return r0
        L87:
            java.lang.Object r8 = r0.f4590e
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto La7
            r0.f4589b = r2
            r0.f4588a = r2
            return r0
        L92:
            if (r8 != 0) goto L9d
            int r8 = r0.d
            if (r8 != 0) goto L9d
            r0.f4589b = r2
            r0.f4588a = r2
            return r0
        L9d:
            if (r9 != 0) goto La7
            int r8 = r0.c
            if (r8 != 0) goto La7
            r0.f4589b = r1
            r0.f4588a = r2
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.h.I(k0.v, k0.v):com.google.android.gms.internal.ads.D9");
    }

    public final ObjectAnimator H(View view, float f4, float f5) {
        if (f4 == f5) {
            return null;
        }
        w.f13563a.Q(view, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, w.f13564b, f5);
        ofFloat.addListener(new a3.c(view));
        a(new g(0, view));
        return ofFloat;
    }

    @Override // k0.o
    public final void d(v vVar) {
        G(vVar);
    }

    @Override // k0.o
    public final void g(v vVar) {
        G(vVar);
        vVar.f13561a.put("android:fade:transitionAlpha", Float.valueOf(w.f13563a.y(vVar.f13562b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (I(n(r3, false), q(r3, false)).f4588a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020a  */
    @Override // k0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, k0.v r25, k0.v r26) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.h.k(android.view.ViewGroup, k0.v, k0.v):android.animation.Animator");
    }

    @Override // k0.o
    public final String[] p() {
        return f13517K;
    }

    @Override // k0.o
    public final boolean r(v vVar, v vVar2) {
        if (vVar == null && vVar2 == null) {
            return false;
        }
        if (vVar != null && vVar2 != null && vVar2.f13561a.containsKey("android:visibility:visibility") != vVar.f13561a.containsKey("android:visibility:visibility")) {
            return false;
        }
        D9 I4 = I(vVar, vVar2);
        if (I4.f4588a) {
            return I4.c == 0 || I4.d == 0;
        }
        return false;
    }
}
