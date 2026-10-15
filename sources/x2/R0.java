package x2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class R0 extends T0 {
    public final AlarmManager d;

    /* renamed from: e, reason: collision with root package name */
    public P0 f15435e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f15436f;

    public R0(X0 x02) {
        super(x02);
        this.d = (AlarmManager) ((C2066c0) this.f1719a).f15562a.getSystemService("alarm");
    }

    @Override // Q1.AbstractC0115n
    public final void e() {
        JobScheduler jobScheduler;
        h();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        K k3 = c2066c0.f15568i;
        C2066c0.i(k3);
        k3.f15402n.a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(l());
        }
        m().a();
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) c2066c0.f15562a.getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(k());
    }

    @Override // x2.T0
    public final void j() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(l());
        }
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((C2066c0) this.f1719a).f15562a.getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(k());
    }

    public final int k() {
        if (this.f15436f == null) {
            this.f15436f = Integer.valueOf("measurement".concat(String.valueOf(((C2066c0) this.f1719a).f15562a.getPackageName())).hashCode());
        }
        return this.f15436f.intValue();
    }

    public final PendingIntent l() {
        Context context = ((C2066c0) this.f1719a).f15562a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.B.f11706a);
    }

    public final AbstractC2085m m() {
        if (this.f15435e == null) {
            this.f15435e = new P0(this, this.f15438b.f15491l, 1);
        }
        return this.f15435e;
    }
}
