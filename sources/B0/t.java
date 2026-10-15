package B0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C0783ji;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import com.google.android.gms.internal.play_billing.AbstractC1644w;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.gms.internal.play_billing.B0;
import x2.X0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class t extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f115b;
    public boolean c;
    public final Object d;

    public t(u uVar, boolean z4) {
        this.d = uVar;
        this.c = z4;
    }

    public t(X0 x02) {
        this.d = x02;
    }

    public synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f115b) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.c ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f115b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b() {
        X0 x02 = (X0) this.d;
        x02.e();
        x02.t().g();
        x02.t().g();
        if (this.f115b) {
            x02.c().f15402n.a("Unregistering connectivity change receiver");
            this.f115b = false;
            this.c = false;
            try {
                x02.f15491l.f15562a.unregisterReceiver(this);
            } catch (IllegalArgumentException e4) {
                x02.c().f15394f.b(e4, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public synchronized void c(Context context) {
        if (!this.f115b) {
            AbstractC1629o.e("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f115b = false;
        }
    }

    public void d(Bundle bundle, d dVar, int i4) {
        AbstractC1644w Y4;
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            ((C0783ji) ((o) ((u) this.d).f119r)).u(n.a(23, i4, dVar));
            return;
        }
        try {
            o oVar = (o) ((u) this.d).f119r;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i5 = AbstractC1644w.f12254a;
            synchronized (AbstractC1644w.class) {
                int i6 = AbstractC1644w.f12254a;
                Y4 = B.Y();
                int i7 = AbstractC1644w.f12254a;
            }
            ((C0783ji) oVar).u(B0.l(byteArray, Y4));
        } catch (Throwable unused) {
            AbstractC1629o.e("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.t.onReceive(android.content.Context, android.content.Intent):void");
    }
}
