package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Bk extends AbstractBinderC1149s4 implements InterfaceC1411y8 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4159o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f4160p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f4161q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Aq f4162r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0272Fc f4163s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ck f4164t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bk(long j4, C0272Fc c0272Fc, Ck ck, Aq aq, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f4164t = ck;
        this.f4159o = obj;
        this.f4160p = str;
        this.f4161q = j4;
        this.f4162r = aq;
        this.f4163s = c0272Fc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 2) {
            d();
        } else {
            if (i4 != 3) {
                return false;
            }
            String readString = parcel.readString();
            AbstractC1192t4.b(parcel);
            K3(readString);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void K3(String str) {
        synchronized (this.f4159o) {
            Ck ck = this.f4164t;
            String str2 = this.f4160p;
            N1.n.f1204A.f1212j.getClass();
            ck.d(str2, (int) (SystemClock.elapsedRealtime() - this.f4161q), str, false);
            this.f4164t.f4534l.a(this.f4160p, "error");
            this.f4164t.f4537o.v(this.f4160p, "error");
            Fq fq = this.f4164t.f4538p;
            Aq aq = this.f4162r;
            aq.y(str);
            aq.b(false);
            fq.b(aq.l());
            this.f4163s.b(Boolean.FALSE);
        }
    }

    public final void d() {
        synchronized (this.f4159o) {
            Ck ck = this.f4164t;
            String str = this.f4160p;
            N1.n.f1204A.f1212j.getClass();
            ck.d(str, (int) (SystemClock.elapsedRealtime() - this.f4161q), "", true);
            this.f4164t.f4534l.c(this.f4160p);
            this.f4164t.f4537o.F(this.f4160p);
            Fq fq = this.f4164t.f4538p;
            Aq aq = this.f4162r;
            aq.b(true);
            fq.b(aq.l());
            this.f4163s.b(Boolean.TRUE);
        }
    }
}
