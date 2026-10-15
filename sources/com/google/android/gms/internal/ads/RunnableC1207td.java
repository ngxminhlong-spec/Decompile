package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.td, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1207td implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10693o = 2;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f10694p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f10695q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f10696r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f10697s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10698t;

    public /* synthetic */ RunnableC1207td(AudioTrack audioTrack, RC rc, Handler handler, UC uc, Y y) {
        this.f10694p = audioTrack;
        this.f10695q = rc;
        this.f10696r = handler;
        this.f10697s = uc;
        this.f10698t = y;
    }

    public /* synthetic */ RunnableC1207td(Ck ck, String str, Bk bk, Pp pp, ArrayList arrayList) {
        this.f10695q = ck;
        this.f10694p = str;
        this.f10696r = bk;
        this.f10697s = pp;
        this.f10698t = arrayList;
    }

    public RunnableC1207td(AbstractC1250ud abstractC1250ud, String str, String str2, String str3, String str4) {
        this.f10698t = abstractC1250ud;
        this.f10694p = str;
        this.f10695q = str2;
        this.f10696r = str3;
        this.f10697s = str4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0136, code lost:
    
        if (r2.equals("noCacheDir") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0141, code lost:
    
        r1 = "io";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013f, code lost:
    
        if (r2.equals("expireFailed") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0153, code lost:
    
        if (r2.equals("externalAbort") != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015e, code lost:
    
        r1 = "policy";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015c, code lost:
    
        if (r2.equals("sizeExceeded") != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016d, code lost:
    
        if (r2.equals("downloadTimeout") != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017b, code lost:
    
        r1 = "network";
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0179, code lost:
    
        if (r2.equals("badUrl") != false) goto L93;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.RunnableC1207td.run():void");
    }
}
