package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447bm extends TimerTask {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f8280o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Timer f8281p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P1.a f8282q;

    public C0447bm(AlertDialog alertDialog, Timer timer, P1.a aVar) {
        this.f8280o = alertDialog;
        this.f8281p = timer;
        this.f8282q = aVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f8280o.dismiss();
        this.f8281p.cancel();
        P1.a aVar = this.f8282q;
        if (aVar != null) {
            aVar.c();
        }
    }
}
