package b1;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.android.gms.internal.ads.C0878lr;
import com.google.android.gms.internal.ads.InterfaceC0409ar;
import p1.r;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215b implements e, InterfaceC0409ar {

    /* renamed from: r, reason: collision with root package name */
    public static C0215b f3456r;

    /* renamed from: o, reason: collision with root package name */
    public float f3457o;

    /* renamed from: p, reason: collision with root package name */
    public Object f3458p;

    /* renamed from: q, reason: collision with root package name */
    public Object f3459q;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, b1.b] */
    public static C0215b a() {
        if (f3456r == null) {
            ?? obj = new Object();
            obj.f3457o = 0.0f;
            f3456r = obj;
        }
        return f3456r;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0409ar
    public void g(boolean z4) {
        if (z4) {
            C0878lr.f9494g.getClass();
            C0878lr.b();
            return;
        }
        C0878lr.f9494g.getClass();
        Handler handler = C0878lr.f9496i;
        if (handler != null) {
            handler.removeCallbacks(C0878lr.f9498k);
            C0878lr.f9496i = null;
        }
    }

    @Override // b1.e
    public void j(Canvas canvas) {
        r rVar = (r) this.f3458p;
        float G3 = rVar.G();
        float F2 = rVar.F();
        int i4 = (int) (F2 / 3.0f);
        int i5 = (int) (i4 * this.f3457o);
        canvas.translate((int) ((G3 - i5) / 2.0f), (int) (F2 / 4.0f));
        Drawable drawable = (Drawable) this.f3459q;
        drawable.setBounds(0, 0, i5, i4);
        drawable.draw(canvas);
        canvas.translate(-r1, -r0);
    }
}
