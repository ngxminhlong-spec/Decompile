package e2;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.C0152a;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.ads.C0831kn;
import f.AbstractActivityC1671f;
import g2.InterfaceC1686f;
import h2.y;
import l2.AbstractC1799b;
import x.C2057d;
import x.C2058e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends f {
    public static final Object c = new Object();
    public static final e d = new Object();

    public static AlertDialog e(Activity activity, int i4, h2.p pVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i4 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(h2.o.b(activity, i4));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i4 != 1 ? i4 != 2 ? i4 != 3 ? resources.getString(R.string.ok) : resources.getString(com.duracodefactory.logiccircuitsimulatorpro.R.string.common_google_play_services_enable_button) : resources.getString(com.duracodefactory.logiccircuitsimulatorpro.R.string.common_google_play_services_update_button) : resources.getString(com.duracodefactory.logiccircuitsimulatorpro.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, pVar);
        }
        String c2 = h2.o.c(activity, i4);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        Log.w("GoogleApiAvailability", U.a.i("Creating dialog for Google Play services availability issue. ConnectionResult=", i4), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.app.DialogFragment, e2.c] */
    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC1671f) {
                androidx.fragment.app.s o4 = ((AbstractActivityC1671f) activity).o();
                j jVar = new j();
                y.j(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.f12760p0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.f12761q0 = onCancelListener;
                }
                jVar.f2807n0 = false;
                jVar.f2808o0 = true;
                o4.getClass();
                C0152a c0152a = new C0152a(o4);
                c0152a.f(0, jVar, str, 1);
                c0152a.e(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        y.j(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f12746o = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f12747p = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i4, GoogleApiActivity googleApiActivity2) {
        AlertDialog e4 = e(googleApiActivity, i4, new h2.p(super.b(i4, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (e4 == null) {
            return;
        }
        f(googleApiActivity, e4, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i4, PendingIntent pendingIntent) {
        int i5;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", U.a.h(i4, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i4 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i4 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e4 = i4 == 6 ? h2.o.e(context, "common_google_play_services_resolution_required_title") : h2.o.c(context, i4);
        if (e4 == null) {
            e4 = context.getResources().getString(com.duracodefactory.logiccircuitsimulatorpro.R.string.common_google_play_services_notification_ticker);
        }
        String d4 = (i4 == 6 || i4 == 19) ? h2.o.d(context, "common_google_play_services_resolution_required_text", h2.o.a(context)) : h2.o.b(context, i4);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        y.i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C2058e c2058e = new C2058e(context, null);
        c2058e.f15190k = true;
        c2058e.f15194o.flags |= 16;
        c2058e.f15184e = C2058e.b(e4);
        C0831kn c0831kn = new C0831kn(21, false);
        c0831kn.f9320q = C2058e.b(d4);
        c2058e.c(c0831kn);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC1799b.c == null) {
            AbstractC1799b.c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC1799b.c.booleanValue()) {
            c2058e.f15194o.icon = context.getApplicationInfo().icon;
            c2058e.f15187h = 2;
            if (AbstractC1799b.j(context)) {
                c2058e.f15183b.add(new C2057d(resources.getString(com.duracodefactory.logiccircuitsimulatorpro.R.string.common_open_on_phone), pendingIntent));
            } else {
                c2058e.f15186g = pendingIntent;
            }
        } else {
            c2058e.f15194o.icon = R.drawable.stat_sys_warning;
            c2058e.f15194o.tickerText = C2058e.b(resources.getString(com.duracodefactory.logiccircuitsimulatorpro.R.string.common_google_play_services_notification_ticker));
            c2058e.f15194o.when = System.currentTimeMillis();
            c2058e.f15186g = pendingIntent;
            c2058e.f15185f = C2058e.b(d4);
        }
        if (AbstractC1799b.f()) {
            y.l(AbstractC1799b.f());
            synchronized (c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.duracodefactory.logiccircuitsimulatorpro.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(B0.s.e(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            c2058e.f15192m = "com.google.android.gms.availability";
        }
        Notification a4 = c2058e.a();
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            h.f12754a.set(false);
            i5 = 10436;
        } else {
            i5 = 39789;
        }
        notificationManager.notify(i5, a4);
    }

    public final void h(Activity activity, InterfaceC1686f interfaceC1686f, int i4, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e4 = e(activity, i4, new h2.p(super.b(i4, activity, "d"), interfaceC1686f, 1), onCancelListener);
        if (e4 == null) {
            return;
        }
        f(activity, e4, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
