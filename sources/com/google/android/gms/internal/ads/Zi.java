package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Zi {

    /* renamed from: a, reason: collision with root package name */
    public final Q1.v f8025a;

    /* renamed from: b, reason: collision with root package name */
    public final C1798a f8026b;
    public final Executor c;

    public Zi(Q1.v vVar, C1798a c1798a, C0260Dc c0260Dc) {
        this.f8025a = vVar;
        this.f8026b = c1798a;
        this.c = c0260Dc;
    }

    public final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        C1798a c1798a = this.f8026b;
        c1798a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        c1798a.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (decodeByteArray != null) {
            long j4 = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z4 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder m4 = U.a.m("Decoded image w: ", width, " h:", height, " bytes: ");
            m4.append(allocationByteCount);
            m4.append(" time: ");
            m4.append(j4);
            m4.append(" on ui thread: ");
            m4.append(z4);
            Q1.I.w(m4.toString());
        }
        return decodeByteArray;
    }
}
