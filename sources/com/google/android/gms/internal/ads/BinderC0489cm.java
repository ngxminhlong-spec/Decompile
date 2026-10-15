package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import l2.C1798a;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import x.C2058e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0489cm extends AbstractBinderC1149s4 implements InterfaceC0947na {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f8399v = 0;

    /* renamed from: o, reason: collision with root package name */
    public final Context f8400o;

    /* renamed from: p, reason: collision with root package name */
    public final C0658gk f8401p;

    /* renamed from: q, reason: collision with root package name */
    public final C0242Ac f8402q;

    /* renamed from: r, reason: collision with root package name */
    public final Xl f8403r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC1263uq f8404s;

    /* renamed from: t, reason: collision with root package name */
    public String f8405t;

    /* renamed from: u, reason: collision with root package name */
    public String f8406u;

    public BinderC0489cm(Context context, Xl xl, C0242Ac c0242Ac, C0658gk c0658gk, InterfaceC1263uq interfaceC1263uq) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f8400o = context;
        this.f8401p = c0658gk;
        this.f8402q = c0242Ac;
        this.f8403r = xl;
        this.f8404s = interfaceC1263uq;
    }

    public static void K3(Context context, C0658gk c0658gk, InterfaceC1263uq interfaceC1263uq, Xl xl, String str, String str2, Map map) {
        String a4;
        N1.n nVar = N1.n.f1204A;
        C1035pc c1035pc = nVar.f1209g;
        C1798a c1798a = nVar.f1212j;
        String str3 = true != c1035pc.j(context) ? "offline" : "online";
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.B7)).booleanValue() || c0658gk == null) {
            C1220tq b4 = C1220tq.b(str2);
            b4.a("gqi", str);
            b4.a("device_connectivity", str3);
            c1798a.getClass();
            b4.a("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                b4.a((String) entry.getKey(), (String) entry.getValue());
            }
            a4 = interfaceC1263uq.a(b4);
        } else {
            C1510e1 a5 = c0658gk.a();
            a5.A("gqi", str);
            a5.A("action", str2);
            a5.A("device_connectivity", str3);
            c1798a.getClass();
            a5.A("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                a5.A((String) entry2.getKey(), (String) entry2.getValue());
            }
            a4 = ((C0658gk) a5.f11915q).f8857a.f9311f.c((ConcurrentHashMap) a5.f11914p);
        }
        String str4 = a4;
        N1.n.f1204A.f1212j.getClass();
        xl.b(new N2(System.currentTimeMillis(), str, str4, 2));
    }

    public static final PendingIntent L3(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return PendingIntent.getService(context, 0, AbstractC0410as.a(intent, 1140850688), 1140850688);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return PendingIntent.getActivity(context, 0, AbstractC0410as.a(intent, 201326592), 201326592);
    }

    public static String M3(String str, int i4) {
        Resources a4 = N1.n.f1204A.f1209g.a();
        return a4 == null ? str : a4.getString(i4);
    }

    public static void Q3(Activity activity, P1.a aVar) {
        String M32 = M3("You'll get a notification with the link when you're back online", R.string.offline_opt_in_confirmation);
        Q1.N n4 = N1.n.f1204A.c;
        AlertDialog.Builder h4 = Q1.N.h(activity);
        h4.setMessage(M32).setOnCancelListener(new DialogInterfaceOnCancelListenerC0288Id(2, aVar));
        AlertDialog create = h4.create();
        create.show();
        Timer timer = new Timer();
        timer.schedule(new C0447bm(create, timer, aVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            Intent intent = (Intent) AbstractC1192t4.a(parcel, Intent.CREATOR);
            AbstractC1192t4.b(parcel);
            j0(intent);
        } else if (i4 == 2) {
            InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            AbstractC1192t4.b(parcel);
            f1(G12, readString, readString2);
        } else if (i4 == 3) {
            f();
        } else if (i4 == 4) {
            InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
            AbstractC1192t4.b(parcel);
            K1(G13);
        } else {
            if (i4 != 5) {
                return false;
            }
            String[] createStringArray = parcel.createStringArray();
            int[] createIntArray = parcel.createIntArray();
            InterfaceC1812a G14 = BinderC1813b.G1(parcel.readStrongBinder());
            AbstractC1192t4.b(parcel);
            l0(createStringArray, createIntArray, G14);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0947na
    public final void K1(InterfaceC1812a interfaceC1812a) {
        Vl vl = (Vl) BinderC1813b.C2(interfaceC1812a);
        Activity activity = vl.f7281a;
        P1.a aVar = vl.f7282b;
        this.f8405t = vl.c;
        this.f8406u = vl.d;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.u7)).booleanValue()) {
            P3(activity, aVar);
            return;
        }
        N3(this.f8405t, "dialog_impression", Lt.f6175u);
        Q1.N n4 = N1.n.f1204A.c;
        AlertDialog.Builder h4 = Q1.N.h(activity);
        h4.setTitle(M3("Open ad when you're back online.", R.string.offline_opt_in_title)).setMessage(M3("We'll send you a notification with a link to the advertiser site.", R.string.offline_opt_in_message)).setPositiveButton(M3("OK", R.string.offline_opt_in_confirm), new Yl(this, activity, aVar, 1)).setNegativeButton(M3("No thanks", R.string.offline_opt_in_decline), new Zl(this, aVar, 1)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0404am(this, aVar, 1));
        h4.create().show();
    }

    public final void N3(String str, String str2, Map map) {
        K3(this.f8400o, this.f8401p, this.f8404s, this.f8403r, str, str2, map);
    }

    public final void O3() {
        Context context = this.f8400o;
        try {
            Q1.N n4 = N1.n.f1204A.c;
            if (Q1.N.H(context).zzf(new BinderC1813b(context), this.f8406u, this.f8405t)) {
                return;
            }
        } catch (RemoteException e4) {
            Y9.q("Failed to schedule offline notification poster.", e4);
        }
        this.f8403r.a(this.f8405t);
        N3(this.f8405t, "offline_notification_worker_not_scheduled", Lt.f6175u);
    }

    public final void P3(Activity activity, P1.a aVar) {
        Q1.N n4 = N1.n.f1204A.c;
        if (new x.g(activity).a()) {
            O3();
            Q3(activity, aVar);
            return;
        }
        int i4 = Build.VERSION.SDK_INT;
        Lt lt = Lt.f6175u;
        if (i4 >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            N3(this.f8405t, "asnpdi", lt);
        } else {
            AlertDialog.Builder h4 = Q1.N.h(activity);
            h4.setTitle(M3("Allow app to send you notifications?", R.string.notifications_permission_title)).setPositiveButton(M3("Allow", R.string.notifications_permission_confirm), new Yl(this, activity, aVar, 0)).setNegativeButton(M3("Don't allow", R.string.notifications_permission_decline), new Zl(this, aVar, 0)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0404am(this, aVar, 0));
            h4.create().show();
            N3(this.f8405t, "rtsdi", lt);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0947na
    public final void f() {
        this.f8403r.d(new C1384xi(12, this.f8402q));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0947na
    public final void f1(InterfaceC1812a interfaceC1812a, String str, String str2) {
        String str3;
        Context context = (Context) BinderC1813b.C2(interfaceC1812a);
        N1.n.f1204A.f1207e.d(context);
        PendingIntent L32 = L3(context, "offline_notification_clicked", str2, str);
        PendingIntent L33 = L3(context, "offline_notification_dismissed", str2, str);
        C2058e c2058e = new C2058e(context, "offline_notification_channel");
        c2058e.f15184e = C2058e.b(M3("View the ad you saved when you were offline", R.string.offline_notification_title));
        c2058e.f15185f = C2058e.b(M3("Tap to open ad", R.string.offline_notification_text));
        Notification notification = c2058e.f15194o;
        notification.flags |= 16;
        notification.deleteIntent = L33;
        c2058e.f15186g = L32;
        c2058e.f15194o.icon = context.getApplicationInfo().icon;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str2, 54321, c2058e.a());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e4) {
            hashMap.put("notification_not_shown_reason", e4.getMessage());
            str3 = "offline_notification_failed";
        }
        N3(str2, str3, hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0947na
    public final void j0(Intent intent) {
        Xl xl = this.f8403r;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            C1035pc c1035pc = N1.n.f1204A.f1209g;
            Context context = this.f8400o;
            boolean j4 = c1035pc.j(context);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r10 = true == j4 ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            N3(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = xl.getWritableDatabase();
                if (r10 == 1) {
                    xl.f7690p.execute(new RunnableC0801k(writableDatabase, stringExtra2, this.f8402q, 5));
                } else {
                    writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                }
            } catch (SQLiteException e4) {
                Y9.p("Failed to get writable offline buffering database: ".concat(e4.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0947na
    public final void l0(String[] strArr, int[] iArr, InterfaceC1812a interfaceC1812a) {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (strArr[i4].equals("android.permission.POST_NOTIFICATIONS")) {
                Vl vl = (Vl) BinderC1813b.C2(interfaceC1812a);
                Activity activity = vl.f7281a;
                P1.a aVar = vl.f7282b;
                HashMap hashMap = new HashMap();
                if (iArr[i4] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    O3();
                    Q3(activity, aVar);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (aVar != null) {
                        aVar.c();
                    }
                }
                N3(this.f8405t, "asnpdc", hashMap);
                return;
            }
        }
    }
}
