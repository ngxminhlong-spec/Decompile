package L2;

import B0.r;
import H.A;
import H.AbstractC0044t;
import V2.g;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import f.C1667b;
import f.DialogC1670e;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends r {

    /* renamed from: q, reason: collision with root package name */
    public final g f1092q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f1093r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r14) {
        /*
            r13 = this;
            r0 = 2130903458(0x7f0301a2, float:1.7413735E38)
            android.util.TypedValue r1 = com.google.android.gms.internal.play_billing.B.M(r14, r0)
            r2 = 0
            if (r1 != 0) goto Lc
            r1 = r2
            goto Le
        Lc:
            int r1 = r1.data
        Le:
            r3 = 0
            r4 = 2130903080(0x7f030028, float:1.7412968E38)
            r5 = 2131820785(0x7f1100f1, float:1.9274295E38)
            android.content.Context r6 = Z2.a.a(r14, r3, r4, r5)
            if (r1 != 0) goto L1c
            goto L22
        L1c:
            j.c r7 = new j.c
            r7.<init>(r6, r1)
            r6 = r7
        L22:
            android.util.TypedValue r14 = com.google.android.gms.internal.play_billing.B.M(r14, r0)
            if (r14 != 0) goto L2a
            r14 = r2
            goto L2c
        L2a:
            int r14 = r14.data
        L2c:
            r13.<init>(r6, r14)
            java.lang.Object r14 = r13.f113p
            f.b r14 = (f.C1667b) r14
            android.view.ContextThemeWrapper r6 = r14.f12786a
            android.content.res.Resources$Theme r14 = r6.getTheme()
            int[] r11 = new int[r2]
            r7 = 0
            r9 = 2130903080(0x7f030028, float:1.7412968E38)
            r10 = 2131820785(0x7f1100f1, float:1.9274295E38)
            P2.w.a(r6, r7, r9, r10)
            int[] r8 = B2.a.f143i
            P2.w.b(r6, r7, r8, r9, r10, r11)
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r7, r8, r9, r10)
            android.content.res.Resources r1 = r6.getResources()
            r7 = 2131099860(0x7f0600d4, float:1.7812085E38)
            int r1 = r1.getDimensionPixelSize(r7)
            r7 = 2
            int r1 = r0.getDimensionPixelSize(r7, r1)
            android.content.res.Resources r7 = r6.getResources()
            r8 = 2131099861(0x7f0600d5, float:1.7812087E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r8 = 3
            int r7 = r0.getDimensionPixelSize(r8, r7)
            android.content.res.Resources r8 = r6.getResources()
            r9 = 2131099859(0x7f0600d3, float:1.7812083E38)
            int r8 = r8.getDimensionPixelSize(r9)
            r9 = 1
            int r8 = r0.getDimensionPixelSize(r9, r8)
            android.content.res.Resources r10 = r6.getResources()
            r11 = 2131099858(0x7f0600d2, float:1.7812081E38)
            int r10 = r10.getDimensionPixelSize(r11)
            int r2 = r0.getDimensionPixelSize(r2, r10)
            r0.recycle()
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            if (r0 != r9) goto La1
            r12 = r8
            r8 = r1
            r1 = r12
        La1:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1, r7, r8, r2)
            r13.f1093r = r0
            java.lang.Class<L2.b> r0 = L2.b.class
            java.lang.String r0 = r0.getCanonicalName()
            r1 = 2130903225(0x7f0300b9, float:1.7413262E38)
            int r0 = com.google.android.gms.internal.play_billing.B.N(r1, r6, r0)
            V2.g r1 = new V2.g
            r1.<init>(r6, r3, r4, r5)
            r1.g(r6)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.i(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 < r2) goto Lfc
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r2 = 16844145(0x1010571, float:2.3697462E-38)
            r14.resolveAttribute(r2, r0, r9)
            java.lang.Object r14 = r13.f113p
            f.b r14 = (f.C1667b) r14
            android.view.ContextThemeWrapper r14 = r14.f12786a
            android.content.res.Resources r14 = r14.getResources()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            float r14 = r0.getDimension(r14)
            int r0 = r0.type
            r2 = 5
            if (r0 != r2) goto Lfc
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 < 0) goto Lfc
            V2.f r0 = r1.f1880o
            V2.k r0 = r0.f1854a
            V2.k r14 = r0.e(r14)
            r1.setShapeAppearanceModel(r14)
        Lfc:
            r13.f1092q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.b.<init>(android.content.Context):void");
    }

    @Override // B0.r
    public final DialogC1670e i() {
        DialogC1670e i4 = super.i();
        Window window = i4.getWindow();
        View decorView = window.getDecorView();
        g gVar = this.f1092q;
        if (gVar != null) {
            WeakHashMap weakHashMap = A.f779a;
            gVar.h(AbstractC0044t.d(decorView));
        }
        Rect rect = this.f1093r;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) gVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(i4, rect));
        return i4;
    }

    public final void p(int i4, DialogInterface.OnClickListener onClickListener) {
        C1667b c1667b = (C1667b) this.f113p;
        c1667b.f12792i = c1667b.f12786a.getText(i4);
        c1667b.f12793j = onClickListener;
    }

    public final void q(int i4, DialogInterface.OnClickListener onClickListener) {
        C1667b c1667b = (C1667b) this.f113p;
        c1667b.f12790g = c1667b.f12786a.getText(i4);
        c1667b.f12791h = onClickListener;
    }

    public final void s(int i4) {
        C1667b c1667b = (C1667b) this.f113p;
        c1667b.d = c1667b.f12786a.getText(i4);
    }
}
