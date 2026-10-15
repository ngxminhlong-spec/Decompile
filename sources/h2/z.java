package h2;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.Ur;
import e2.C1664b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class z extends Ur {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1706e f13249b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AbstractC1706e abstractC1706e, Looper looper) {
        super(looper, 3);
        this.f13249b = abstractC1706e;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f13249b.f13173K.get() != message.arg1) {
            int i4 = message.what;
            if (i4 == 2 || i4 == 1 || i4 == 7) {
                s sVar = (s) message.obj;
                sVar.getClass();
                sVar.d();
                return;
            }
            return;
        }
        int i5 = message.what;
        if ((i5 == 1 || i5 == 7 || i5 == 4 || i5 == 5) && !this.f13249b.g()) {
            s sVar2 = (s) message.obj;
            sVar2.getClass();
            sVar2.d();
            return;
        }
        int i6 = message.what;
        if (i6 == 4) {
            AbstractC1706e abstractC1706e = this.f13249b;
            abstractC1706e.f13170H = new C1664b(message.arg2);
            if (!abstractC1706e.f13171I && !TextUtils.isEmpty(abstractC1706e.u()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC1706e.u());
                    AbstractC1706e abstractC1706e2 = this.f13249b;
                    if (!abstractC1706e2.f13171I) {
                        abstractC1706e2.z(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            AbstractC1706e abstractC1706e3 = this.f13249b;
            C1664b c1664b = abstractC1706e3.f13170H;
            if (c1664b == null) {
                c1664b = new C1664b(8);
            }
            abstractC1706e3.f13183x.a(c1664b);
            System.currentTimeMillis();
            return;
        }
        if (i6 == 5) {
            AbstractC1706e abstractC1706e4 = this.f13249b;
            C1664b c1664b2 = abstractC1706e4.f13170H;
            if (c1664b2 == null) {
                c1664b2 = new C1664b(8);
            }
            abstractC1706e4.f13183x.a(c1664b2);
            System.currentTimeMillis();
            return;
        }
        if (i6 == 3) {
            Object obj = message.obj;
            this.f13249b.f13183x.a(new C1664b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i6 == 6) {
            this.f13249b.z(5, null);
            InterfaceC1703b interfaceC1703b = this.f13249b.f13165C;
            if (interfaceC1703b != null) {
                interfaceC1703b.O(message.arg2);
            }
            System.currentTimeMillis();
            AbstractC1706e.y(this.f13249b, 5, 1, null);
            return;
        }
        if (i6 == 2 && !this.f13249b.a()) {
            s sVar3 = (s) message.obj;
            sVar3.getClass();
            sVar3.d();
            return;
        }
        int i7 = message.what;
        if (i7 != 2 && i7 != 1 && i7 != 7) {
            Log.wtf("GmsClient", U.a.i("Don't know how to handle message: ", i7), new Exception());
            return;
        }
        s sVar4 = (s) message.obj;
        synchronized (sVar4) {
            try {
                bool = sVar4.f13241a;
                if (sVar4.f13242b) {
                    Log.w("GmsClient", "Callback proxy " + sVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC1706e abstractC1706e5 = sVar4.f13244f;
            int i8 = sVar4.d;
            if (i8 != 0) {
                abstractC1706e5.z(1, null);
                Bundle bundle = sVar4.f13243e;
                sVar4.a(new C1664b(i8, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!sVar4.b()) {
                abstractC1706e5.z(1, null);
                sVar4.a(new C1664b(8, null));
            }
        }
        synchronized (sVar4) {
            sVar4.f13242b = true;
        }
        sVar4.d();
    }
}
