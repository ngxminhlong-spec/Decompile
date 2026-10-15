package x2;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2092p0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f15761o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f15762p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f15763q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f15764r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f15765s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f15766t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f15767u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2103v0 f15768v;

    public RunnableC2092p0(C2103v0 c2103v0, String str, String str2, long j4, Bundle bundle, boolean z4, boolean z5, boolean z6) {
        this.f15768v = c2103v0;
        this.f15761o = str;
        this.f15762p = str2;
        this.f15763q = j4;
        this.f15764r = bundle;
        this.f15765s = z4;
        this.f15766t = z5;
        this.f15767u = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15768v.o(this.f15761o, this.f15762p, this.f15763q, this.f15764r, this.f15765s, this.f15766t, this.f15767u);
    }
}
