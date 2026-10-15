package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ad, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243Ad extends AbstractC1398xw implements LB {

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f3947H = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: I, reason: collision with root package name */
    public static final AtomicReference f3948I = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    public int f3949A;

    /* renamed from: B, reason: collision with root package name */
    public long f3950B;

    /* renamed from: C, reason: collision with root package name */
    public long f3951C;

    /* renamed from: D, reason: collision with root package name */
    public long f3952D;

    /* renamed from: E, reason: collision with root package name */
    public long f3953E;

    /* renamed from: F, reason: collision with root package name */
    public int f3954F;

    /* renamed from: G, reason: collision with root package name */
    public final HashSet f3955G;

    /* renamed from: s, reason: collision with root package name */
    public final C1465zd f3956s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3957t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3958u;

    /* renamed from: v, reason: collision with root package name */
    public final String f3959v;

    /* renamed from: w, reason: collision with root package name */
    public final C0831kn f3960w;

    /* renamed from: x, reason: collision with root package name */
    public HttpURLConnection f3961x;
    public InputStream y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3962z;

    public C0243Ad(String str, C0273Fd c0273Fd, int i4, int i5, int i6) {
        super(true);
        this.f3956s = new C1465zd(this);
        this.f3955G = new HashSet();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f3959v = str;
        this.f3960w = new C0831kn(4);
        this.f3957t = i4;
        this.f3958u = i5;
        this.f3954F = i6;
        if (c0273Fd != null) {
            b(c0273Fd);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1398xw, com.google.android.gms.internal.ads.Px
    public final Map a() {
        HttpURLConnection httpURLConnection = this.f3961x;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final Uri e() {
        HttpURLConnection httpURLConnection = this.f3961x;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void h() {
        HttpURLConnection httpURLConnection = this.f3961x;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                Y9.q("Unexpected error while disconnecting", e4);
            }
            this.f3961x = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final void i() {
        HashSet hashSet = this.f3955G;
        try {
            if (this.y != null) {
                HttpURLConnection httpURLConnection = this.f3961x;
                long j4 = this.f3951C;
                if (j4 != -1) {
                    j4 -= this.f3953E;
                }
                int i4 = AbstractC0751is.f9071a;
                if (i4 == 19 || i4 == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j4 == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j4 <= 2048) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, null);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.y.close();
                } catch (IOException e4) {
                    throw new JB(e4, 2000, 3);
                }
            }
            this.y = null;
            h();
            if (this.f3962z) {
                this.f3962z = false;
                c();
            }
            hashSet.clear();
        } catch (Throwable th) {
            this.y = null;
            h();
            if (this.f3962z) {
                this.f3962z = false;
                c();
            }
            hashSet.clear();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0213 A[Catch: IOException -> 0x0038, TryCatch #0 {IOException -> 0x0038, blocks: (B:3:0x000c, B:4:0x001d, B:6:0x0023, B:8:0x002d, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:19:0x007f, B:21:0x0099, B:22:0x00ab, B:23:0x00b0, B:37:0x00e5, B:93:0x0208, B:95:0x0213, B:97:0x0224, B:103:0x022d, B:104:0x023c, B:107:0x0243, B:108:0x024a, B:112:0x024b, B:113:0x0261), top: B:2:0x000c }] */
    @Override // com.google.android.gms.internal.ads.Px
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o(com.google.android.gms.internal.ads.C0757iz r21) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0243Ad.o(com.google.android.gms.internal.ads.iz):long");
    }

    @Override // com.google.android.gms.internal.ads.ZD
    public final int r(byte[] bArr, int i4, int i5) {
        AtomicReference atomicReference = f3948I;
        try {
            if (this.f3952D != this.f3950B) {
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j4 = this.f3952D;
                    long j5 = this.f3950B;
                    if (j4 == j5) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.y.read(bArr2, 0, (int) Math.min(j5 - j4, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f3952D += read;
                    v(read);
                }
            }
            if (i5 == 0) {
                return 0;
            }
            long j6 = this.f3951C;
            if (j6 != -1) {
                long j7 = j6 - this.f3953E;
                if (j7 == 0) {
                    return -1;
                }
                i5 = (int) Math.min(i5, j7);
            }
            int read2 = this.y.read(bArr, i4, i5);
            if (read2 == -1) {
                if (this.f3951C != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.f3953E += read2;
            v(read2);
            return read2;
        } catch (IOException e4) {
            throw new JB(e4, 2000, 2);
        }
    }
}
