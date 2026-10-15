package Q1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.C1421yc;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.ads.Zf;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class M extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1667a;

    public /* synthetic */ M(int i4) {
        this.f1667a = i4;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f1667a) {
            case 0:
                synchronized (C1421yc.f11357b) {
                    C1421yc.c = false;
                    C1421yc.d = false;
                    Y9.s("Ad debug logging enablement is out of date.");
                }
                AbstractC1806a.U(context);
                return;
            default:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        Zf.f8022b = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            Zf.f8022b = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }
}
