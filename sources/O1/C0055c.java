package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.C0275Ga;
import com.google.android.gms.internal.ads.C1464zc;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055c extends AbstractC0079o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f1347b;
    public final /* synthetic */ BinderC0983o9 c;

    public C0055c(OutOfContextTestingActivity outOfContextTestingActivity, BinderC0983o9 binderC0983o9) {
        this.f1347b = outOfContextTestingActivity;
        this.c = binderC0983o9;
    }

    @Override // O1.AbstractC0079o
    public final /* bridge */ /* synthetic */ Object a() {
        C0077n.d(this.f1347b, "out_of_context_tester");
        return null;
    }

    @Override // O1.AbstractC0079o
    public final Object b(Q q4) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f1347b;
        BinderC1813b binderC1813b = new BinderC1813b(outOfContextTestingActivity);
        AbstractC1066q6.a(outOfContextTestingActivity);
        if (((Boolean) r.d.c.a(AbstractC1066q6.o8)).booleanValue()) {
            return q4.a1(binderC1813b, this.c, 234310000);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O1.AbstractC0079o
    public final Object c() {
        C0080o0 c0080o0;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f1347b;
        BinderC1813b binderC1813b = new BinderC1813b(outOfContextTestingActivity);
        AbstractC1066q6.a(outOfContextTestingActivity);
        if (((Boolean) r.d.c.a(AbstractC1066q6.o8)).booleanValue()) {
            try {
                try {
                    IBinder b4 = AbstractC1230u.J(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (b4 == null) {
                        c0080o0 = 0;
                    } else {
                        IInterface queryLocalInterface = b4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        c0080o0 = queryLocalInterface instanceof C0080o0 ? (C0080o0) queryLocalInterface : new AbstractC1106r4(b4, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator", 0);
                    }
                    return c0080o0.W2(binderC1813b, this.c);
                } catch (Exception e4) {
                    throw new Exception(e4);
                }
            } catch (RemoteException e5) {
                e = e5;
                C0275Ga.b(outOfContextTestingActivity).g("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (C1464zc e6) {
                e = e6;
                C0275Ga.b(outOfContextTestingActivity).g("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (NullPointerException e7) {
                e = e7;
                C0275Ga.b(outOfContextTestingActivity).g("ClientApiBroker.getOutOfContextTester", e);
                return null;
            }
        }
        return null;
    }
}
