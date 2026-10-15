package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Yl implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7872o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f7873p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f7874q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7875r;

    public /* synthetic */ Yl(BinderC0489cm binderC0489cm, Activity activity, P1.a aVar, int i4) {
        this.f7872o = i4;
        this.f7873p = binderC0489cm;
        this.f7874q = activity;
        this.f7875r = aVar;
    }

    public Yl(C0734ia c0734ia, String str, String str2) {
        this.f7872o = 2;
        this.f7875r = c0734ia;
        this.f7873p = str;
        this.f7874q = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f7872o) {
            case 0:
                BinderC0489cm binderC0489cm = (BinderC0489cm) this.f7873p;
                Activity activity = (Activity) this.f7874q;
                P1.a aVar = (P1.a) this.f7875r;
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "confirm");
                binderC0489cm.N3(binderC0489cm.f8405t, "rtsdc", hashMap);
                activity.startActivity(N1.n.f1204A.f1207e.c(activity));
                binderC0489cm.O3();
                if (aVar != null) {
                    aVar.c();
                    return;
                }
                return;
            case 1:
                BinderC0489cm binderC0489cm2 = (BinderC0489cm) this.f7873p;
                Activity activity2 = (Activity) this.f7874q;
                P1.a aVar2 = (P1.a) this.f7875r;
                binderC0489cm2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "confirm");
                binderC0489cm2.N3(binderC0489cm2.f8405t, "dialog_click", hashMap2);
                binderC0489cm2.P3(activity2, aVar2);
                return;
            default:
                C0734ia c0734ia = (C0734ia) this.f7875r;
                DownloadManager downloadManager = (DownloadManager) c0734ia.f9042s.getSystemService("download");
                try {
                    String str = (String) this.f7873p;
                    String str2 = (String) this.f7874q;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
                    Q1.N n4 = N1.n.f1204A.c;
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                    return;
                } catch (IllegalStateException unused) {
                    c0734ia.G("Could not store picture.");
                    return;
                }
        }
    }
}
