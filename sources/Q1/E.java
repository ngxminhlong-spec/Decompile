package Q1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.A4;
import com.google.android.gms.internal.ads.AbstractC0287Ic;
import com.google.android.gms.internal.ads.AbstractC0751is;
import com.google.android.gms.internal.ads.Bp;
import com.google.android.gms.internal.ads.C0621fq;
import com.google.android.gms.internal.ads.Y3;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import p1.C1915a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1625b;

    public /* synthetic */ E(int i4, Object obj) {
        this.f1624a = i4;
        this.f1625b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        switch (this.f1624a) {
            case 0:
                F f4 = (F) this.f1625b;
                synchronized (f4) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((WeakHashMap) f4.f1629r).entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            ((BroadcastReceiver) arrayList.get(i4)).onReceive(context, intent);
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                N n4 = (N) this.f1625b;
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    n4.f1671e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        n4.f1671e = false;
                        return;
                    }
                    return;
                }
            case 2:
                ((Y3) this.f1625b).c();
                return;
            case 3:
                ((A4) this.f1625b).c(3);
                return;
            case 4:
                C0621fq c0621fq = (C0621fq) this.f1625b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i5 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i5 = type != 9 ? 8 : 7;
                                        }
                                        i5 = 5;
                                    }
                                }
                                i5 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i5 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i5 = 4;
                                    break;
                                case 13:
                                    i5 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i5 = 6;
                                    break;
                                case 18:
                                    i5 = 2;
                                    break;
                                case 20:
                                    if (AbstractC0751is.f9071a >= 29) {
                                        i5 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i5 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (AbstractC0751is.f9071a < 31 || i5 != 5) {
                    C0621fq.e(c0621fq, i5);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        throw null;
                    }
                    Bp bp = new Bp(c0621fq);
                    mainExecutor = context.getMainExecutor();
                    telephonyManager.registerTelephonyCallback(mainExecutor, bp);
                    telephonyManager.unregisterTelephonyCallback(bp);
                    return;
                } catch (RuntimeException unused2) {
                    C0621fq.e(c0621fq, 5);
                    return;
                }
            case 5:
                e1.j jVar = (e1.j) this.f1625b;
                q2.e eVar = jVar.c;
                if (intent == null) {
                    return;
                }
                ArrayList arrayList2 = jVar.f12725e;
                int size2 = arrayList2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj = arrayList2.get(i6);
                    i6++;
                    C1915a c1915a = (C1915a) obj;
                    if (c1915a.a() == -1000) {
                        jVar.b(intent);
                        c1915a.b(eVar);
                    } else if (c1915a.a() == -1002) {
                        jVar.c(intent);
                        c1915a.b(eVar);
                    }
                }
                return;
            case 6:
                ((AbstractC0287Ic) this.f1625b).i();
                return;
            case 7:
                if (intent != null) {
                    ((u0.c) this.f1625b).g(intent);
                    return;
                }
                return;
            default:
                if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    return;
                }
                n0.n.d().a(u0.e.f14976j, "Network broadcast received", new Throwable[0]);
                u0.e eVar2 = (u0.e) this.f1625b;
                eVar2.c(eVar2.f());
                return;
        }
    }
}
