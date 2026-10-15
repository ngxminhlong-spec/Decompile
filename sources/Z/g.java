package Z;

import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final V2.e f2277a = new V2.e(15);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2278b = {112, 114, 111, 0};
    public static final byte[] c = {112, 114, 109, 0};
    public static final byte[] d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2279e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f2280f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f2281g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f2282h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f2283i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f2284j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(d[] dVarArr, byte[] bArr) {
        int i4 = 0;
        for (d dVar : dVarArr) {
            i4 += ((((dVar.f2273g * 2) + 7) & (-8)) / 8) + (dVar.f2271e * 2) + d(dVar.f2269a, dVar.f2270b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + dVar.f2272f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i4);
        if (Arrays.equals(bArr, f2280f)) {
            for (d dVar2 : dVarArr) {
                p(byteArrayOutputStream, dVar2, d(dVar2.f2269a, dVar2.f2270b, bArr));
                r(byteArrayOutputStream, dVar2);
                int[] iArr = dVar2.f2274h;
                int length = iArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = iArr[i5];
                    u(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                q(byteArrayOutputStream, dVar2);
            }
        } else {
            for (d dVar3 : dVarArr) {
                p(byteArrayOutputStream, dVar3, d(dVar3.f2269a, dVar3.f2270b, bArr));
            }
            for (d dVar4 : dVarArr) {
                r(byteArrayOutputStream, dVar4);
                int[] iArr2 = dVar4.f2274h;
                int length2 = iArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length2) {
                    int i10 = iArr2[i8];
                    u(byteArrayOutputStream, i10 - i9);
                    i8++;
                    i9 = i10;
                }
                q(byteArrayOutputStream, dVar4);
            }
        }
        if (byteArrayOutputStream.size() == i4) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i4);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z4 = true;
        for (File file2 : listFiles) {
            z4 = c(file2) && z4;
        }
        return z4;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f2282h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f2281g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return n0.a.j(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i4) {
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int read = inputStream.read(bArr, i5, i4 - i5);
            if (read < 0) {
                throw new IllegalStateException(U.a.i("Not enough bytes to read: ", i4));
            }
            i5 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i4) {
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += (int) m(byteArrayInputStream, 2);
            iArr[i6] = i5;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.g.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static d[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, d[] dVarArr) {
        byte[] bArr3 = f2283i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f2284j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m4 = (int) m(fileInputStream, 2);
            byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h4);
            try {
                d[] k3 = k(byteArrayInputStream, bArr2, m4, dVarArr);
                byteArrayInputStream.close();
                return k3;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m5 = (int) m(fileInputStream, 1);
        byte[] h5 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h5);
        try {
            d[] j4 = j(byteArrayInputStream2, m5, dVarArr);
            byteArrayInputStream2.close();
            return j4;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static d[] j(ByteArrayInputStream byteArrayInputStream, int i4, d[] dVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new d[0];
        }
        if (i4 != dVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            iArr[i5] = (int) m(byteArrayInputStream, 2);
            strArr[i5] = new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8);
        }
        for (int i6 = 0; i6 < i4; i6++) {
            d dVar = dVarArr[i6];
            if (!dVar.f2270b.equals(strArr[i6])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i7 = iArr[i6];
            dVar.f2271e = i7;
            dVar.f2274h = g(byteArrayInputStream, i7);
        }
        return dVarArr;
    }

    public static d[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i4, d[] dVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new d[0];
        }
        if (i4 != dVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m4 = m(byteArrayInputStream, 4);
            int m5 = (int) m(byteArrayInputStream, 2);
            d dVar = null;
            if (dVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i6 = 0;
                while (true) {
                    if (i6 >= dVarArr.length) {
                        break;
                    }
                    if (dVarArr[i6].f2270b.equals(substring)) {
                        dVar = dVarArr[i6];
                        break;
                    }
                    i6++;
                }
            }
            if (dVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            dVar.d = m4;
            int[] g4 = g(byteArrayInputStream, m5);
            if (Arrays.equals(bArr, f2282h)) {
                dVar.f2271e = m5;
                dVar.f2274h = g4;
            }
        }
        return dVarArr;
    }

    public static d[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f2279e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m4 = (int) m(fileInputStream, 1);
        byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h4);
        try {
            d[] n4 = n(byteArrayInputStream, str, m4);
            byteArrayInputStream.close();
            return n4;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i4) {
        byte[] f4 = f(inputStream, i4);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 += (f4[i5] & 255) << (i5 * 8);
        }
        return j4;
    }

    public static d[] n(ByteArrayInputStream byteArrayInputStream, String str, int i4) {
        int i5 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            int m5 = (int) m(byteArrayInputStream, 2);
            dVarArr[i6] = new d(str, new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m5, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m5], new TreeMap());
        }
        int i7 = 0;
        while (i7 < i4) {
            d dVar = dVarArr[i7];
            int available = byteArrayInputStream.available();
            int i8 = dVar.f2272f;
            int i9 = dVar.f2273g;
            TreeMap treeMap = dVar.f2275i;
            int i10 = available - i8;
            int i11 = i5;
            while (byteArrayInputStream.available() > i10) {
                i11 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i11), 1);
                int m6 = (int) m(byteArrayInputStream, 2);
                while (m6 > 0) {
                    m(byteArrayInputStream, 2);
                    int m7 = (int) m(byteArrayInputStream, 1);
                    if (m7 != 6 && m7 != 7) {
                        while (m7 > 0) {
                            m(byteArrayInputStream, 1);
                            int i12 = i5;
                            int i13 = i7;
                            for (int m8 = (int) m(byteArrayInputStream, 1); m8 > 0; m8--) {
                                m(byteArrayInputStream, 2);
                            }
                            m7--;
                            i5 = i12;
                            i7 = i13;
                        }
                    }
                    m6--;
                    i5 = i5;
                    i7 = i7;
                }
            }
            int i14 = i5;
            int i15 = i7;
            if (byteArrayInputStream.available() != i10) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            dVar.f2274h = g(byteArrayInputStream, dVar.f2271e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i9 * 2) + 7) & (-8)) / 8));
            for (int i16 = i14; i16 < i9; i16++) {
                int i17 = valueOf.get(i16) ? 2 : i14;
                if (valueOf.get(i16 + i9)) {
                    i17 |= 4;
                }
                if (i17 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i16));
                    if (num == null) {
                        num = Integer.valueOf(i14);
                    }
                    treeMap.put(Integer.valueOf(i16), Integer.valueOf(i17 | num.intValue()));
                }
            }
            i7 = i15 + 1;
            i5 = i14;
        }
        return dVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, d[] dVarArr) {
        long j4;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = d;
        int i4 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f2279e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b4 = b(dVarArr, bArr3);
                t(byteArrayOutputStream, dVarArr.length, 1);
                t(byteArrayOutputStream, b4.length, 4);
                byte[] a4 = a(b4);
                t(byteArrayOutputStream, a4.length, 4);
                byteArrayOutputStream.write(a4);
                return true;
            }
            byte[] bArr4 = f2281g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, dVarArr.length, 1);
                for (d dVar : dVarArr) {
                    int size = dVar.f2275i.size() * 4;
                    String d4 = d(dVar.f2269a, dVar.f2270b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d4.getBytes(charset).length);
                    u(byteArrayOutputStream, dVar.f2274h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, dVar.c, 4);
                    byteArrayOutputStream.write(d4.getBytes(charset));
                    Iterator it = dVar.f2275i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i5 : dVar.f2274h) {
                        u(byteArrayOutputStream, i5);
                    }
                }
                return true;
            }
            byte[] bArr5 = f2280f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b5 = b(dVarArr, bArr5);
                t(byteArrayOutputStream, dVarArr.length, 1);
                t(byteArrayOutputStream, b5.length, 4);
                byte[] a5 = a(b5);
                t(byteArrayOutputStream, a5.length, 4);
                byteArrayOutputStream.write(a5);
                return true;
            }
            byte[] bArr6 = f2282h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, dVarArr.length);
            for (d dVar2 : dVarArr) {
                String str = dVar2.f2269a;
                TreeMap treeMap = dVar2.f2275i;
                String d5 = d(str, dVar2.f2270b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d5.getBytes(charset2).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, dVar2.f2274h.length);
                t(byteArrayOutputStream, dVar2.c, 4);
                byteArrayOutputStream.write(d5.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i6 : dVar2.f2274h) {
                    u(byteArrayOutputStream, i6);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, dVarArr.length);
            int i7 = 2;
            int i8 = 2;
            for (d dVar3 : dVarArr) {
                t(byteArrayOutputStream2, dVar3.c, 4);
                t(byteArrayOutputStream2, dVar3.d, 4);
                t(byteArrayOutputStream2, dVar3.f2273g, 4);
                String d6 = d(dVar3.f2269a, dVar3.f2270b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d6.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i8 = i8 + 14 + length2;
                byteArrayOutputStream2.write(d6.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i8 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray.length);
            }
            p pVar = new p(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(pVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = 0;
            int i10 = 0;
            while (i9 < dVarArr.length) {
                try {
                    d dVar4 = dVarArr[i9];
                    u(byteArrayOutputStream3, i9);
                    u(byteArrayOutputStream3, dVar4.f2271e);
                    i10 = i10 + 4 + (dVar4.f2271e * i7);
                    int[] iArr = dVar4.f2274h;
                    int length3 = iArr.length;
                    int i11 = i4;
                    int i12 = i7;
                    int i13 = i11;
                    while (i13 < length3) {
                        int i14 = iArr[i13];
                        u(byteArrayOutputStream3, i14 - i11);
                        i13++;
                        i11 = i14;
                    }
                    i9++;
                    i7 = i12;
                    i4 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i10 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray2.length);
            }
            p pVar2 = new p(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(pVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < dVarArr.length) {
                try {
                    d dVar5 = dVarArr[i15];
                    Iterator it3 = dVar5.f2275i.entrySet().iterator();
                    int i17 = 0;
                    while (it3.hasNext()) {
                        i17 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, dVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, dVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i15);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i18 = i16 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i17);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i16 = i18 + length4;
                            i15++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
            }
            p pVar3 = new p(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(pVar3);
            long j5 = 4;
            long size2 = j5 + j5 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i19 = 0;
            while (i19 < arrayList2.size()) {
                p pVar4 = (p) arrayList2.get(i19);
                int i20 = pVar4.f2292a;
                byte[] bArr7 = pVar4.f2293b;
                if (i20 == 1) {
                    j4 = 0;
                } else if (i20 == 2) {
                    j4 = 1;
                } else if (i20 == 3) {
                    j4 = 2;
                } else if (i20 == 4) {
                    j4 = 3;
                } else {
                    if (i20 != 5) {
                        throw null;
                    }
                    j4 = 4;
                }
                t(byteArrayOutputStream, j4, 4);
                t(byteArrayOutputStream, size2, 4);
                if (pVar4.c) {
                    long length5 = bArr7.length;
                    byte[] a6 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a6);
                    t(byteArrayOutputStream, a6.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a6.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i19++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i21));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, d dVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, dVar.f2271e);
        t(byteArrayOutputStream, dVar.f2272f, 4);
        t(byteArrayOutputStream, dVar.c, 4);
        t(byteArrayOutputStream, dVar.f2273g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, d dVar) {
        byte[] bArr = new byte[(((dVar.f2273g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : dVar.f2275i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i4 = intValue / 8;
                bArr[i4] = (byte) (bArr[i4] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i5 = intValue + dVar.f2273g;
                int i6 = i5 / 8;
                bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, d dVar) {
        int i4 = 0;
        for (Map.Entry entry : dVar.f2275i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i4);
                u(byteArrayOutputStream, 0);
                i4 = intValue;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x0155. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(android.content.Context r18, java.util.concurrent.Executor r19, Z.f r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.g.s(android.content.Context, java.util.concurrent.Executor, Z.f, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j4, int i4) {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) ((j4 >> (i5 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        t(byteArrayOutputStream, i4, 2);
    }
}
