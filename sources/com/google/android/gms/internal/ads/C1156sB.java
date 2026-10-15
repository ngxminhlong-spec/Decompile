package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.sB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1156sB extends AbstractC0587ez {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10600b;
    public final Object c;

    public C1156sB(String str, int i4) {
        this.f10600b = i4;
        switch (i4) {
            case 1:
                this.c = Logger.getLogger(str);
                return;
            default:
                this.c = str;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0587ez
    public final void g(String str) {
        switch (this.f10600b) {
            case 0:
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
                sb.append(str2);
                sb.append(":");
                sb.append(str);
                Log.d("isoparser", sb.toString());
                return;
            default:
                ((Logger) this.c).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                return;
        }
    }
}
