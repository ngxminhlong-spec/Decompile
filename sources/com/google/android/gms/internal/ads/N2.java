package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1510e1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class N2 {

    /* renamed from: a, reason: collision with root package name */
    public long f6302a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6303b;
    public final Serializable c;
    public final Object d;

    public N2(long j4, String str, String str2, int i4) {
        this.f6302a = j4;
        this.c = str;
        this.d = str2;
        this.f6303b = i4;
    }

    public N2(C1510e1 c1510e1) {
        this.c = new LinkedHashMap(16, 0.75f, true);
        this.f6302a = 0L;
        this.d = c1510e1;
        this.f6303b = 5242880;
    }

    public N2(File file) {
        this.c = new LinkedHashMap(16, 0.75f, true);
        this.f6302a = 0L;
        this.d = new M3(6, file);
        this.f6303b = 20971520;
    }

    public static int d(L2 l22) {
        return (m(l22) << 24) | m(l22) | (m(l22) << 8) | (m(l22) << 16);
    }

    public static long e(L2 l22) {
        return (m(l22) & 255) | ((m(l22) & 255) << 8) | ((m(l22) & 255) << 16) | ((m(l22) & 255) << 24) | ((m(l22) & 255) << 32) | ((m(l22) & 255) << 40) | ((m(l22) & 255) << 48) | ((m(l22) & 255) << 56);
    }

    public static String g(L2 l22) {
        return new String(l(l22, e(l22)), "UTF-8");
    }

    public static void i(BufferedOutputStream bufferedOutputStream, int i4) {
        bufferedOutputStream.write(i4 & 255);
        bufferedOutputStream.write((i4 >> 8) & 255);
        bufferedOutputStream.write((i4 >> 16) & 255);
        bufferedOutputStream.write((i4 >> 24) & 255);
    }

    public static void j(BufferedOutputStream bufferedOutputStream, long j4) {
        bufferedOutputStream.write((byte) j4);
        bufferedOutputStream.write((byte) (j4 >>> 8));
        bufferedOutputStream.write((byte) (j4 >>> 16));
        bufferedOutputStream.write((byte) (j4 >>> 24));
        bufferedOutputStream.write((byte) (j4 >>> 32));
        bufferedOutputStream.write((byte) (j4 >>> 40));
        bufferedOutputStream.write((byte) (j4 >>> 48));
        bufferedOutputStream.write((byte) (j4 >>> 56));
    }

    public static void k(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        j(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static byte[] l(L2 l22, long j4) {
        long j5 = l22.f6117o - l22.f6118p;
        if (j4 >= 0 && j4 <= j5) {
            int i4 = (int) j4;
            if (i4 == j4) {
                byte[] bArr = new byte[i4];
                new DataInputStream(l22).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j4 + ", maxLength=" + j5);
    }

    public static int m(L2 l22) {
        int read = l22.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static final String o(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public synchronized C1190t2 a(String str) {
        K2 k22 = (K2) ((LinkedHashMap) this.c).get(str);
        if (k22 == null) {
            return null;
        }
        File f4 = f(str);
        try {
            L2 l22 = new L2(new BufferedInputStream(new FileInputStream(f4)), f4.length());
            try {
                K2 a4 = K2.a(l22);
                if (!TextUtils.equals(str, a4.f5964b)) {
                    I2.a("%s: key=%s, found=%s", f4.getAbsolutePath(), str, a4.f5964b);
                    K2 k23 = (K2) ((LinkedHashMap) this.c).remove(str);
                    if (k23 != null) {
                        this.f6302a -= k23.f5963a;
                    }
                    return null;
                }
                byte[] l4 = l(l22, l22.f6117o - l22.f6118p);
                C1190t2 c1190t2 = new C1190t2();
                c1190t2.f10667a = l4;
                c1190t2.f10668b = k22.c;
                c1190t2.c = k22.d;
                c1190t2.d = k22.f5965e;
                c1190t2.f10669e = k22.f5966f;
                c1190t2.f10670f = k22.f5967g;
                List<C1362x2> list = k22.f5968h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (C1362x2 c1362x2 : list) {
                    treeMap.put(c1362x2.f11231a, c1362x2.f11232b);
                }
                c1190t2.f10671g = treeMap;
                c1190t2.f10672h = Collections.unmodifiableList(k22.f5968h);
                return c1190t2;
            } finally {
                l22.close();
            }
        } catch (IOException e4) {
            I2.a("%s: %s", f4.getAbsolutePath(), e4.toString());
            h(str);
            return null;
        }
    }

    public synchronized void b() {
        long length;
        L2 l22;
        File mo2b = ((M2) this.d).mo2b();
        if (mo2b.exists()) {
            File[] listFiles = mo2b.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        length = file.length();
                        l22 = new L2(new BufferedInputStream(new FileInputStream(file)), length);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        K2 a4 = K2.a(l22);
                        a4.f5963a = length;
                        n(a4.f5964b, a4);
                        l22.close();
                    } catch (Throwable th) {
                        l22.close();
                        throw th;
                        break;
                    }
                }
            }
        } else if (!mo2b.mkdirs()) {
            I2.b("Unable to create cache dir %s", mo2b.getAbsolutePath());
        }
    }

    public synchronized void c(String str, C1190t2 c1190t2) {
        int i4;
        BufferedOutputStream bufferedOutputStream;
        K2 k22;
        int i5;
        long j4;
        try {
            long j5 = this.f6302a;
            int length = c1190t2.f10667a.length;
            long j6 = j5 + length;
            int i6 = this.f6303b;
            if (j6 <= i6 || length <= i6 * 0.9f) {
                File f4 = f(str);
                int i7 = 0;
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(f4));
                    k22 = new K2(str, c1190t2);
                } catch (IOException unused) {
                    i4 = i7;
                }
                try {
                    try {
                        i(bufferedOutputStream, 538247942);
                        k(bufferedOutputStream, str);
                        String str2 = k22.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        k(bufferedOutputStream, str2);
                        j(bufferedOutputStream, k22.d);
                        j(bufferedOutputStream, k22.f5965e);
                        j(bufferedOutputStream, k22.f5966f);
                        j(bufferedOutputStream, k22.f5967g);
                        List<C1362x2> list = k22.f5968h;
                        if (list != null) {
                            i(bufferedOutputStream, list.size());
                            for (C1362x2 c1362x2 : list) {
                                k(bufferedOutputStream, c1362x2.f11231a);
                                k(bufferedOutputStream, c1362x2.f11232b);
                            }
                        } else {
                            i(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(c1190t2.f10667a);
                        bufferedOutputStream.close();
                        k22.f5963a = f4.length();
                        n(str, k22);
                        if (this.f6302a >= this.f6303b) {
                            if (I2.f5528a) {
                                I2.c("Pruning old cache entries.", new Object[0]);
                            }
                            long j7 = this.f6302a;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
                            int i8 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i5 = i7;
                                    j4 = j7;
                                    break;
                                }
                                K2 k23 = (K2) ((Map.Entry) it.next()).getValue();
                                if (f(k23.f5964b).delete()) {
                                    i5 = i7;
                                    j4 = j7;
                                    this.f6302a -= k23.f5963a;
                                } else {
                                    i5 = i7;
                                    j4 = j7;
                                    String str3 = k23.f5964b;
                                    String o4 = o(str3);
                                    Object[] objArr = new Object[2];
                                    objArr[i5] = str3;
                                    objArr[1] = o4;
                                    I2.a("Could not delete cache entry for key=%s, filename=%s", objArr);
                                }
                                it.remove();
                                i8++;
                                if (((float) this.f6302a) < this.f6303b * 0.9f) {
                                    break;
                                }
                                j7 = j4;
                                i7 = i5;
                            }
                            if (I2.f5528a) {
                                Integer valueOf = Integer.valueOf(i8);
                                Long valueOf2 = Long.valueOf(this.f6302a - j4);
                                Long valueOf3 = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
                                Object[] objArr2 = new Object[3];
                                objArr2[i5] = valueOf;
                                objArr2[1] = valueOf2;
                                objArr2[2] = valueOf3;
                                I2.c("pruned %d files, %d bytes, %d ms", objArr2);
                            }
                        }
                    } catch (IOException e4) {
                        I2.a("%s", e4.toString());
                        bufferedOutputStream.close();
                        I2.a("Failed to write header for %s", f4.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused2) {
                    if (!f4.delete()) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i4] = f4.getAbsolutePath();
                        I2.a("Could not clean up file %s", objArr3);
                    }
                    if (!((M2) this.d).mo2b().exists()) {
                        I2.a("Re-initializing cache after external clearing.", new Object[i4]);
                        ((LinkedHashMap) this.c).clear();
                        this.f6302a = 0L;
                        b();
                    }
                }
            }
        } finally {
        }
    }

    public File f(String str) {
        return new File(((M2) this.d).mo2b(), o(str));
    }

    public synchronized void h(String str) {
        boolean delete = f(str).delete();
        K2 k22 = (K2) ((LinkedHashMap) this.c).remove(str);
        if (k22 != null) {
            this.f6302a -= k22.f5963a;
        }
        if (delete) {
            return;
        }
        I2.a("Could not delete cache entry for key=%s, filename=%s", str, o(str));
    }

    public void n(String str, K2 k22) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        if (linkedHashMap.containsKey(str)) {
            this.f6302a = (k22.f5963a - ((K2) linkedHashMap.get(str)).f5963a) + this.f6302a;
        } else {
            this.f6302a += k22.f5963a;
        }
        linkedHashMap.put(str, k22);
    }
}
