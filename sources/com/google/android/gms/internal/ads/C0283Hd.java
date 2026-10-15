package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283Hd extends AbstractC1398xw implements LB {

    /* renamed from: J, reason: collision with root package name */
    public static final Pattern f5430J = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: A, reason: collision with root package name */
    public boolean f5431A;

    /* renamed from: B, reason: collision with root package name */
    public int f5432B;

    /* renamed from: C, reason: collision with root package name */
    public long f5433C;

    /* renamed from: D, reason: collision with root package name */
    public long f5434D;

    /* renamed from: E, reason: collision with root package name */
    public long f5435E;

    /* renamed from: F, reason: collision with root package name */
    public long f5436F;

    /* renamed from: G, reason: collision with root package name */
    public long f5437G;

    /* renamed from: H, reason: collision with root package name */
    public final long f5438H;

    /* renamed from: I, reason: collision with root package name */
    public final long f5439I;

    /* renamed from: s, reason: collision with root package name */
    public final int f5440s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5441t;

    /* renamed from: u, reason: collision with root package name */
    public final String f5442u;

    /* renamed from: v, reason: collision with root package name */
    public final C0831kn f5443v;

    /* renamed from: w, reason: collision with root package name */
    public C0757iz f5444w;

    /* renamed from: x, reason: collision with root package name */
    public HttpURLConnection f5445x;
    public final ArrayDeque y;

    /* renamed from: z, reason: collision with root package name */
    public InputStream f5446z;

    public C0283Hd(String str, C0273Fd c0273Fd, int i4, int i5, long j4, long j5) {
        super(true);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f5442u = str;
        this.f5443v = new C0831kn(4);
        this.f5440s = i4;
        this.f5441t = i5;
        this.y = new ArrayDeque();
        this.f5438H = j4;
        this.f5439I = j5;
        if (c0273Fd != null) {
            b(c0273Fd);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1398xw, com.google.android.gms.internal.ads.Px
    public final Map a() {
        HttpURLConnection httpURLConnection = this.f5445x;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final Uri e() {
        HttpURLConnection httpURLConnection = this.f5445x;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection h(int i4, long j4, long j5) {
        String uri = this.f5444w.f9104a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f5440s);
            httpURLConnection.setReadTimeout(this.f5441t);
            for (Map.Entry entry : this.f5443v.z().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j4 + "-" + j5);
            httpURLConnection.setRequestProperty("User-Agent", this.f5442u);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.y.add(httpURLConnection);
            String uri2 = this.f5444w.f9104a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f5432B = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    k();
                    throw new JB(2000, i4, U.a.i("Response code: ", this.f5432B));
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f5446z != null) {
                        inputStream = new SequenceInputStream(this.f5446z, inputStream);
                    }
                    this.f5446z = inputStream;
                    return httpURLConnection;
                } catch (IOException e4) {
                    k();
                    throw new JB(e4, 2000, i4);
                }
            } catch (IOException e5) {
                k();
                throw new JB("Unable to connect to ".concat(String.valueOf(uri2)), e5, 2000, i4);
            }
        } catch (IOException e6) {
            throw new JB("Unable to connect to ".concat(String.valueOf(uri)), e6, 2000, i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final void i() {
        try {
            InputStream inputStream = this.f5446z;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    throw new JB(e4, 2000, 3);
                }
            }
        } finally {
            this.f5446z = null;
            k();
            if (this.f5431A) {
                this.f5431A = false;
                c();
            }
        }
    }

    public final void k() {
        while (true) {
            ArrayDeque arrayDeque = this.y;
            if (arrayDeque.isEmpty()) {
                this.f5445x = null;
                return;
            } else {
                try {
                    ((HttpURLConnection) arrayDeque.remove()).disconnect();
                } catch (Exception e4) {
                    Y9.q("Unexpected error while disconnecting", e4);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final long o(C0757iz c0757iz) {
        this.f5444w = c0757iz;
        this.f5434D = 0L;
        long j4 = c0757iz.d;
        long j5 = c0757iz.f9106e;
        long j6 = this.f5438H;
        if (j5 != -1) {
            j6 = Math.min(j6, j5);
        }
        this.f5435E = j4;
        HttpURLConnection h4 = h(1, j4, (j6 + j4) - 1);
        this.f5445x = h4;
        String headerField = h4.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f5430J.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    if (j5 != -1) {
                        this.f5433C = j5;
                        this.f5436F = Math.max(parseLong, (this.f5435E + j5) - 1);
                    } else {
                        this.f5433C = parseLong2 - this.f5435E;
                        this.f5436F = parseLong2 - 1;
                    }
                    this.f5437G = parseLong;
                    this.f5431A = true;
                    g(c0757iz);
                    return this.f5433C;
                } catch (NumberFormatException unused) {
                    Y9.p("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new JB(2000, 1, "Invalid content range: ".concat(String.valueOf(headerField)));
    }

    @Override // com.google.android.gms.internal.ads.ZD
    public final int r(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        try {
            long j4 = this.f5433C;
            long j5 = this.f5434D;
            if (j4 - j5 == 0) {
                return -1;
            }
            long j6 = this.f5435E + j5;
            long j7 = i5;
            long j8 = j6 + j7 + this.f5439I;
            long j9 = this.f5437G;
            long j10 = j9 + 1;
            if (j8 > j10) {
                long j11 = this.f5436F;
                if (j9 < j11) {
                    long min = Math.min(j11, Math.max(((this.f5438H + j10) - r4) - 1, (j10 + j7) - 1));
                    h(2, j10, min);
                    this.f5437G = min;
                    j9 = min;
                }
            }
            int read = this.f5446z.read(bArr, i4, (int) Math.min(j7, ((j9 + 1) - this.f5435E) - this.f5434D));
            if (read == -1) {
                throw new EOFException();
            }
            this.f5434D += read;
            v(read);
            return read;
        } catch (IOException e4) {
            throw new JB(e4, 2000, 2);
        }
    }
}
