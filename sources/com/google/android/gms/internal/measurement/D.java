package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class D extends AbstractBinderC1585w implements J {

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReference f11715o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11716p;

    public D() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f11715o = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a0(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L38
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L38
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected object type. Expected, Received: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D.a0(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1585w
    public final boolean O(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC1589x.a(parcel, Bundle.CREATOR);
        AbstractC1589x.b(parcel);
        d3(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle Q(long j4) {
        Bundle bundle;
        synchronized (this.f11715o) {
            if (!this.f11716p) {
                try {
                    this.f11715o.wait(j4);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f11715o.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void d3(Bundle bundle) {
        synchronized (this.f11715o) {
            try {
                try {
                    this.f11715o.set(bundle);
                    this.f11716p = true;
                } finally {
                    this.f11715o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
