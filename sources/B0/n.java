package B0;

import com.google.android.gms.internal.play_billing.A0;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import com.google.android.gms.internal.play_billing.B0;
import com.google.android.gms.internal.play_billing.D0;
import com.google.android.gms.internal.play_billing.E0;
import com.google.android.gms.internal.play_billing.F0;
import com.google.android.gms.internal.play_billing.G0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f92a = 0;

    static {
        int i4 = o.f93a;
    }

    public static B0 a(int i4, int i5, d dVar) {
        try {
            A0 o4 = B0.o();
            F0 p3 = G0.p();
            int i6 = dVar.f72b;
            p3.c();
            G0.l((G0) p3.f12141p, i6);
            String str = dVar.c;
            p3.c();
            G0.m((G0) p3.f12141p, str);
            p3.c();
            G0.o((G0) p3.f12141p, i4);
            o4.c();
            B0.m((B0) o4.f12141p, (G0) p3.a());
            o4.c();
            B0.n((B0) o4.f12141p, i5);
            return (B0) o4.a();
        } catch (Exception e4) {
            AbstractC1629o.f("BillingLogger", "Unable to create logging payload", e4);
            return null;
        }
    }

    public static E0 b(int i4) {
        try {
            D0 m4 = E0.m();
            m4.c();
            E0.l((E0) m4.f12141p, i4);
            return (E0) m4.a();
        } catch (Exception e4) {
            AbstractC1629o.f("BillingLogger", "Unable to create logging payload", e4);
            return null;
        }
    }
}
