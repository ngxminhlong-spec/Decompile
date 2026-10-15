package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class JB extends C0715hy {

    /* renamed from: p, reason: collision with root package name */
    public final int f5788p;

    public JB() {
        this.f5788p = 1;
    }

    public JB(int i4, int i5, String str) {
        super(str, i4 == 2000 ? i5 != 1 ? 2000 : 2001 : i4);
        this.f5788p = i5;
    }

    public JB(IOException iOException, int i4, int i5) {
        super(i4 == 2000 ? i5 != 1 ? 2000 : 2001 : i4, iOException);
        this.f5788p = i5;
    }

    public JB(String str, IOException iOException, int i4, int i5) {
        super(str, iOException, i4 == 2000 ? i5 != 1 ? 2000 : 2001 : i4);
        this.f5788p = i5;
    }

    public static JB a(IOException iOException, int i4) {
        String message = iOException.getMessage();
        int i5 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !Zf.i(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i5 == 2007 ? new JB("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new JB(iOException, i5, i4);
    }
}
