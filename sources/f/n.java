package f;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC0287Ic;
import com.google.android.gms.internal.play_billing.B;
import java.util.Calendar;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n extends AbstractC0287Ic {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ q d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f12852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, Context context) {
        super(qVar);
        this.d = qVar;
        this.f12852e = (PowerManager) context.getSystemService("power");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, q2.e eVar) {
        super(qVar);
        this.d = qVar;
        this.f12852e = eVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0287Ic
    public final IntentFilter d() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, f.s] */
    @Override // com.google.android.gms.internal.ads.AbstractC0287Ic
    public final int e() {
        Location location;
        boolean z4;
        long j4;
        Location location2;
        switch (this.c) {
            case 0:
                return ((PowerManager) this.f12852e).isPowerSaveMode() ? 2 : 1;
            default:
                q2.e eVar = (q2.e) this.f12852e;
                t tVar = (t) eVar.f14711r;
                LocationManager locationManager = (LocationManager) eVar.f14710q;
                if (tVar.f12920b > System.currentTimeMillis()) {
                    z4 = tVar.f12919a;
                } else {
                    Context context = (Context) eVar.f14709p;
                    Location location3 = null;
                    if (B.h(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e4) {
                            Log.d("TwilightManager", "Failed to get last known location", e4);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (B.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e5) {
                            Log.d("TwilightManager", "Failed to get last known location", e5);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (s.d == null) {
                            s.d = new Object();
                        }
                        s sVar = s.d;
                        sVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        sVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z4 = sVar.c == 1;
                        long j5 = sVar.f12918b;
                        long j6 = sVar.f12917a;
                        sVar.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j7 = sVar.f12918b;
                        if (j5 == -1 || j6 == -1) {
                            j4 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j6) {
                                j5 = j7;
                            } else if (currentTimeMillis > j5) {
                                j5 = j6;
                            }
                            j4 = j5 + 60000;
                        }
                        tVar.f12919a = z4;
                        tVar.f12920b = j4;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i4 = Calendar.getInstance().get(11);
                        if (i4 < 6 || i4 >= 22) {
                            z4 = true;
                        }
                    }
                }
                return z4 ? 2 : 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0287Ic
    public final void i() {
        switch (this.c) {
            case 0:
                this.d.j(true);
                return;
            default:
                this.d.j(true);
                return;
        }
    }
}
