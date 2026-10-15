package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H2 {
    public static final boolean c = I2.f5528a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5378a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f5379b = false;

    public final synchronized void a(String str, long j4) {
        if (this.f5379b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f5378a.add(new G2(j4, SystemClock.elapsedRealtime(), str));
    }

    public final synchronized void b(String str) {
        long j4;
        this.f5379b = true;
        if (this.f5378a.size() == 0) {
            j4 = 0;
        } else {
            j4 = ((G2) this.f5378a.get(r1.size() - 1)).c - ((G2) this.f5378a.get(0)).c;
        }
        if (j4 > 0) {
            long j5 = ((G2) this.f5378a.get(0)).c;
            I2.a("(%-4d ms) %s", Long.valueOf(j4), str);
            ArrayList arrayList = this.f5378a;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                G2 g22 = (G2) obj;
                long j6 = g22.c;
                I2.a("(+%-4d) [%2d] %s", Long.valueOf(j6 - j5), Long.valueOf(g22.f5132b), g22.f5131a);
                j5 = j6;
            }
        }
    }

    public final void finalize() {
        if (this.f5379b) {
            return;
        }
        b("Request on the loose");
        I2.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
