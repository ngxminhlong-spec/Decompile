package com.google.android.gms.internal.ads;

import O1.C0091u0;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Xd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0363Xd implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ BinderC0368Yd f7653o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7654p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7655q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f7656r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f7657s;

    public /* synthetic */ RunnableC0363Xd(BinderC0368Yd binderC0368Yd, int i4, int i5, boolean z4, boolean z5) {
        this.f7653o = binderC0368Yd;
        this.f7654p = i4;
        this.f7655q = i5;
        this.f7656r = z4;
        this.f7657s = z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        ?? r10;
        ?? r22;
        C0091u0 c0091u0;
        C0091u0 c0091u02;
        C0091u0 c0091u03;
        BinderC0368Yd binderC0368Yd = this.f7653o;
        int i5 = this.f7654p;
        int i6 = this.f7655q;
        boolean z4 = this.f7656r;
        boolean z5 = this.f7657s;
        synchronized (binderC0368Yd.f7846p) {
            try {
                boolean z6 = binderC0368Yd.f7851u;
                if (z6 || i6 != 1) {
                    i4 = i6;
                    r10 = false;
                } else {
                    i6 = 1;
                    i4 = 1;
                    r10 = true;
                }
                ?? r1 = i5 != i6;
                if (r1 == true && i4 == 1) {
                    r22 = true;
                    i4 = 1;
                } else {
                    r22 = false;
                }
                ?? r12 = r1 == true && i4 == 2;
                ?? r13 = r1 == true && i4 == 3;
                binderC0368Yd.f7851u = z6 || r10 == true;
                if (r10 != false) {
                    try {
                        C0091u0 c0091u04 = binderC0368Yd.f7850t;
                        if (c0091u04 != null) {
                            c0091u04.g();
                        }
                    } catch (RemoteException e4) {
                        Y9.u("#007 Could not call remote method.", e4);
                    }
                }
                if (r22 != false && (c0091u03 = binderC0368Yd.f7850t) != null) {
                    c0091u03.G1(c0091u03.Q(), 2);
                }
                if (r12 != false && (c0091u02 = binderC0368Yd.f7850t) != null) {
                    c0091u02.h();
                }
                if (r13 != false) {
                    C0091u0 c0091u05 = binderC0368Yd.f7850t;
                    if (c0091u05 != null) {
                        c0091u05.a();
                    }
                    binderC0368Yd.f7845o.Z();
                }
                if (z4 != z5 && (c0091u0 = binderC0368Yd.f7850t) != null) {
                    Parcel Q3 = c0091u0.Q();
                    ClassLoader classLoader = AbstractC1192t4.f10673a;
                    Q3.writeInt(z5 ? 1 : 0);
                    c0091u0.G1(Q3, 5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
