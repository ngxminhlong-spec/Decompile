package g2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.ads.C0831kn;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class p extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f13019a;

    /* renamed from: b, reason: collision with root package name */
    public final C0831kn f13020b;

    public p(C0831kn c0831kn) {
        this.f13020b = c0831kn;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.f13020b.f9320q;
            throw null;
        }
    }
}
