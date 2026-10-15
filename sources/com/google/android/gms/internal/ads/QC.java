package com.google.android.gms.internal.ads;

import java.net.URL;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class QC implements InterfaceC1132ro {

    /* renamed from: o, reason: collision with root package name */
    public int f6650o;

    /* renamed from: p, reason: collision with root package name */
    public long f6651p;

    /* renamed from: q, reason: collision with root package name */
    public Object f6652q;

    public QC(int i4, URL url, long j4) {
        this.f6650o = i4;
        this.f6652q = url;
        this.f6651p = j4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l */
    public void mo6l(Object obj) {
        ((PC) obj).n((OC) this.f6652q, this.f6650o, this.f6651p);
    }
}
