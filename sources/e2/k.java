package e2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.ads.Ur;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k extends Ur {

    /* renamed from: b, reason: collision with root package name */
    public final Context f12763b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.c = eVar;
        this.f12763b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i4);
            return;
        }
        int i5 = f.f12752a;
        e eVar = this.c;
        Context context = this.f12763b;
        int c = eVar.c(context, i5);
        AtomicBoolean atomicBoolean = h.f12754a;
        if (c == 1 || c == 2 || c == 3 || c == 9) {
            Intent b4 = eVar.b(c, context, "n");
            eVar.g(context, c, b4 == null ? null : PendingIntent.getActivity(context, 0, b4, 201326592));
        }
    }
}
