package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class S0 implements B {

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f6878c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f6879d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f6880e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f6881f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final UUID f6882g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final Map f6883h0;

    /* renamed from: A, reason: collision with root package name */
    public long f6884A;

    /* renamed from: B, reason: collision with root package name */
    public long f6885B;

    /* renamed from: C, reason: collision with root package name */
    public B0.r f6886C;

    /* renamed from: D, reason: collision with root package name */
    public B0.r f6887D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f6888E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6889F;

    /* renamed from: G, reason: collision with root package name */
    public int f6890G;

    /* renamed from: H, reason: collision with root package name */
    public long f6891H;

    /* renamed from: I, reason: collision with root package name */
    public long f6892I;

    /* renamed from: J, reason: collision with root package name */
    public int f6893J;

    /* renamed from: K, reason: collision with root package name */
    public int f6894K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f6895L;

    /* renamed from: M, reason: collision with root package name */
    public int f6896M;
    public int N;

    /* renamed from: O, reason: collision with root package name */
    public int f6897O;

    /* renamed from: P, reason: collision with root package name */
    public int f6898P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f6899Q;

    /* renamed from: R, reason: collision with root package name */
    public long f6900R;

    /* renamed from: S, reason: collision with root package name */
    public int f6901S;

    /* renamed from: T, reason: collision with root package name */
    public int f6902T;

    /* renamed from: U, reason: collision with root package name */
    public int f6903U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f6904V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f6905W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f6906X;

    /* renamed from: Y, reason: collision with root package name */
    public int f6907Y;

    /* renamed from: Z, reason: collision with root package name */
    public byte f6908Z;

    /* renamed from: a, reason: collision with root package name */
    public final P0 f6909a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f6910a0;

    /* renamed from: b, reason: collision with root package name */
    public final T0 f6911b;

    /* renamed from: b0, reason: collision with root package name */
    public D f6912b0;
    public final SparseArray c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final C1134rq f6913e;

    /* renamed from: f, reason: collision with root package name */
    public final C1134rq f6914f;

    /* renamed from: g, reason: collision with root package name */
    public final C1134rq f6915g;

    /* renamed from: h, reason: collision with root package name */
    public final C1134rq f6916h;

    /* renamed from: i, reason: collision with root package name */
    public final C1134rq f6917i;

    /* renamed from: j, reason: collision with root package name */
    public final C1134rq f6918j;

    /* renamed from: k, reason: collision with root package name */
    public final C1134rq f6919k;

    /* renamed from: l, reason: collision with root package name */
    public final C1134rq f6920l;

    /* renamed from: m, reason: collision with root package name */
    public final C1134rq f6921m;

    /* renamed from: n, reason: collision with root package name */
    public final C1134rq f6922n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f6923o;

    /* renamed from: p, reason: collision with root package name */
    public long f6924p;

    /* renamed from: q, reason: collision with root package name */
    public long f6925q;

    /* renamed from: r, reason: collision with root package name */
    public long f6926r;

    /* renamed from: s, reason: collision with root package name */
    public long f6927s;

    /* renamed from: t, reason: collision with root package name */
    public long f6928t;

    /* renamed from: u, reason: collision with root package name */
    public R0 f6929u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6930v;

    /* renamed from: w, reason: collision with root package name */
    public int f6931w;

    /* renamed from: x, reason: collision with root package name */
    public long f6932x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public long f6933z;

    static {
        int i4 = AbstractC0751is.f9071a;
        f6879d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AbstractC1480zs.c);
        f6880e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f6881f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f6882g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f6883h0 = Collections.unmodifiableMap(hashMap);
    }

    public S0() {
        P0 p02 = new P0();
        this.f6925q = -1L;
        this.f6926r = -9223372036854775807L;
        this.f6927s = -9223372036854775807L;
        this.f6928t = -9223372036854775807L;
        this.f6933z = -1L;
        this.f6884A = -1L;
        this.f6885B = -9223372036854775807L;
        this.f6909a = p02;
        p02.d = new M3(3, this);
        this.d = true;
        this.f6911b = new T0();
        this.c = new SparseArray();
        this.f6915g = new C1134rq(4);
        this.f6916h = new C1134rq(ByteBuffer.allocate(4).putInt(-1).array());
        this.f6917i = new C1134rq(4);
        this.f6913e = new C1134rq(Wj.f7530G);
        this.f6914f = new C1134rq(4);
        this.f6918j = new C1134rq();
        this.f6919k = new C1134rq();
        this.f6920l = new C1134rq(8);
        this.f6921m = new C1134rq();
        this.f6922n = new C1134rq();
        this.f6895L = new int[1];
    }

    public static byte[] n(long j4, long j5, String str) {
        Zf.O(j4 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i4 = (int) (j4 / 3600000000L);
        Integer valueOf = Integer.valueOf(i4);
        long j6 = j4 - (i4 * 3600000000L);
        int i5 = (int) (j6 / 60000000);
        Integer valueOf2 = Integer.valueOf(i5);
        long j7 = j6 - (i5 * 60000000);
        int i6 = (int) (j7 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i6), Integer.valueOf((int) ((j7 - (i6 * 1000000)) / j5)));
        int i7 = AbstractC0751is.f9071a;
        return format.getBytes(AbstractC1480zs.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x062a, code lost:
    
        if (r0.t() == r1.getLeastSignificantBits()) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0210, code lost:
    
        if (r2.equals("A_FLAC") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0217, code lost:
    
        if (r2.equals("A_EAC3") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x021e, code lost:
    
        if (r2.equals("V_MPEG2") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0225, code lost:
    
        if (r2.equals("S_TEXT/UTF8") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x022c, code lost:
    
        if (r2.equals("S_TEXT/WEBVTT") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0233, code lost:
    
        if (r2.equals("V_MPEGH/ISO/HEVC") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x023a, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0241, code lost:
    
        if (r2.equals("A_PCM/INT/LIT") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0248, code lost:
    
        if (r2.equals("A_PCM/INT/BIG") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x024f, code lost:
    
        if (r2.equals("A_PCM/FLOAT/IEEE") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0256, code lost:
    
        if (r2.equals("A_DTS/EXPRESS") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x025d, code lost:
    
        if (r2.equals("V_THEORA") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0264, code lost:
    
        if (r2.equals("S_HDMV/PGS") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x026b, code lost:
    
        if (r2.equals("V_VP9") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0204, code lost:
    
        if (r2.equals("A_OPUS") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0206, code lost:
    
        r2 = r48;
        r21 = "V_VP9";
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:101:0x0518. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x01fb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03a1  */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.lang.ArrayIndexOutOfBoundsException] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.ArrayIndexOutOfBoundsException] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r49) {
        /*
            Method dump skipped, instructions count: 3244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.S0.a(int):void");
    }

    public final int b(C c, R0 r02, int i4, boolean z4) {
        int e4;
        int e5;
        int i5;
        if ("S_TEXT/UTF8".equals(r02.f6750b)) {
            m(c, f6878c0, i4);
            int i6 = this.f6902T;
            l();
            return i6;
        }
        if ("S_TEXT/ASS".equals(r02.f6750b)) {
            m(c, f6880e0, i4);
            int i7 = this.f6902T;
            l();
            return i7;
        }
        if ("S_TEXT/WEBVTT".equals(r02.f6750b)) {
            m(c, f6881f0, i4);
            int i8 = this.f6902T;
            l();
            return i8;
        }
        V v4 = r02.f6747Y;
        boolean z5 = this.f6904V;
        C1134rq c1134rq = this.f6918j;
        if (!z5) {
            boolean z6 = r02.f6754h;
            C1134rq c1134rq2 = this.f6915g;
            if (z6) {
                this.f6897O &= -1073741825;
                if (!this.f6905W) {
                    ((C1316w) c).C(c1134rq2.f10536a, 0, 1, false);
                    this.f6901S++;
                    byte b4 = c1134rq2.f10536a[0];
                    if ((b4 & 128) == 128) {
                        throw C0907md.a("Extension bit is set in signal byte", null);
                    }
                    this.f6908Z = b4;
                    this.f6905W = true;
                }
                byte b5 = this.f6908Z;
                if ((b5 & 1) == 1) {
                    int i9 = b5 & 2;
                    this.f6897O |= 1073741824;
                    if (!this.f6910a0) {
                        C1134rq c1134rq3 = this.f6920l;
                        ((C1316w) c).C(c1134rq3.f10536a, 0, 8, false);
                        this.f6901S += 8;
                        this.f6910a0 = true;
                        c1134rq2.f10536a[0] = (byte) ((i9 == 2 ? 128 : 0) | 8);
                        c1134rq2.e(0);
                        v4.c(1, c1134rq2);
                        this.f6902T++;
                        c1134rq3.e(0);
                        v4.c(8, c1134rq3);
                        this.f6902T += 8;
                    }
                    if (i9 == 2) {
                        if (!this.f6906X) {
                            ((C1316w) c).C(c1134rq2.f10536a, 0, 1, false);
                            this.f6901S++;
                            c1134rq2.e(0);
                            this.f6907Y = c1134rq2.m();
                            this.f6906X = true;
                        }
                        int i10 = this.f6907Y * 4;
                        c1134rq2.b(i10);
                        ((C1316w) c).C(c1134rq2.f10536a, 0, i10, false);
                        this.f6901S += i10;
                        int i11 = (this.f6907Y >> 1) + 1;
                        int i12 = (i11 * 6) + 2;
                        ByteBuffer byteBuffer = this.f6923o;
                        if (byteBuffer == null || byteBuffer.capacity() < i12) {
                            this.f6923o = ByteBuffer.allocate(i12);
                        }
                        this.f6923o.position(0);
                        this.f6923o.putShort((short) i11);
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            i5 = this.f6907Y;
                            if (i13 >= i5) {
                                break;
                            }
                            int p3 = c1134rq2.p();
                            int i15 = p3 - i14;
                            if (i13 % 2 == 0) {
                                this.f6923o.putShort((short) i15);
                            } else {
                                this.f6923o.putInt(i15);
                            }
                            i13++;
                            i14 = p3;
                        }
                        int i16 = (i4 - this.f6901S) - i14;
                        if ((i5 & 1) == 1) {
                            this.f6923o.putInt(i16);
                        } else {
                            this.f6923o.putShort((short) i16);
                            this.f6923o.putInt(0);
                        }
                        byte[] array = this.f6923o.array();
                        C1134rq c1134rq4 = this.f6921m;
                        c1134rq4.c(i12, array);
                        v4.c(i12, c1134rq4);
                        this.f6902T += i12;
                    }
                }
            } else {
                byte[] bArr = r02.f6755i;
                if (bArr != null) {
                    c1134rq.c(bArr.length, bArr);
                }
            }
            if (!"A_OPUS".equals(r02.f6750b) ? r02.f6752f > 0 : z4) {
                this.f6897O |= 268435456;
                this.f6922n.b(0);
                int i17 = (c1134rq.c + i4) - this.f6901S;
                c1134rq2.b(4);
                byte[] bArr2 = c1134rq2.f10536a;
                bArr2[0] = (byte) ((i17 >> 24) & 255);
                bArr2[1] = (byte) ((i17 >> 16) & 255);
                bArr2[2] = (byte) ((i17 >> 8) & 255);
                bArr2[3] = (byte) (i17 & 255);
                v4.c(4, c1134rq2);
                this.f6902T += 4;
            }
            this.f6904V = true;
        }
        int i18 = i4 + c1134rq.c;
        if (!"V_MPEG4/ISO/AVC".equals(r02.f6750b) && !"V_MPEGH/ISO/HEVC".equals(r02.f6750b)) {
            if (r02.f6743U != null) {
                Zf.X(c1134rq.c == 0);
                r02.f6743U.c(c);
            }
            while (true) {
                int i19 = this.f6901S;
                if (i19 >= i18) {
                    break;
                }
                int i20 = i18 - i19;
                int g4 = c1134rq.g();
                if (g4 > 0) {
                    e5 = Math.min(i20, g4);
                    v4.c(e5, c1134rq);
                } else {
                    e5 = v4.e(c, i20, false);
                }
                this.f6901S += e5;
                this.f6902T += e5;
            }
        } else {
            C1134rq c1134rq5 = this.f6914f;
            byte[] bArr3 = c1134rq5.f10536a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i21 = r02.f6748Z;
            int i22 = 4 - i21;
            while (this.f6901S < i18) {
                int i23 = this.f6903U;
                if (i23 == 0) {
                    int min = Math.min(i21, c1134rq.g());
                    ((C1316w) c).C(bArr3, i22 + min, i21 - min, false);
                    if (min > 0) {
                        c1134rq.a(bArr3, i22, min);
                    }
                    this.f6901S += i21;
                    c1134rq5.e(0);
                    this.f6903U = c1134rq5.p();
                    C1134rq c1134rq6 = this.f6913e;
                    c1134rq6.e(0);
                    v4.c(4, c1134rq6);
                    this.f6902T += 4;
                } else {
                    int g5 = c1134rq.g();
                    if (g5 > 0) {
                        e4 = Math.min(i23, g5);
                        v4.c(e4, c1134rq);
                    } else {
                        e4 = v4.e(c, i23, false);
                    }
                    this.f6901S += e4;
                    this.f6902T += e4;
                    this.f6903U -= e4;
                }
            }
        }
        if ("A_VORBIS".equals(r02.f6750b)) {
            C1134rq c1134rq7 = this.f6916h;
            c1134rq7.e(0);
            v4.c(4, c1134rq7);
            this.f6902T += 4;
        }
        int i24 = this.f6902T;
        l();
        return i24;
    }

    public final long c(long j4) {
        long j5 = this.f6926r;
        if (j5 != -9223372036854775807L) {
            return AbstractC0751is.v(j4, j5, 1000L, RoundingMode.FLOOR);
        }
        throw C0907md.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        B0.r rVar = new B0.r(4, (byte) 0);
        C1134rq c1134rq = (C1134rq) rVar.f113p;
        C1316w c1316w = (C1316w) c;
        long j4 = c1316w.f11099q;
        long j5 = 1024;
        if (j4 != -1 && j4 <= 1024) {
            j5 = j4;
        }
        c1316w.E(c1134rq.f10536a, 0, 4, false);
        long u2 = c1134rq.u();
        rVar.f112o = 4;
        while (true) {
            if (u2 != 440786851) {
                int i4 = (int) j5;
                int i5 = rVar.f112o + 1;
                rVar.f112o = i5;
                if (i5 == i4) {
                    break;
                }
                c1316w.E(c1134rq.f10536a, 0, 1, false);
                u2 = ((u2 << 8) & (-256)) | (c1134rq.f10536a[0] & 255);
            } else {
                long o4 = rVar.o(c1316w);
                long j6 = rVar.f112o;
                if (o4 != Long.MIN_VALUE) {
                    long j7 = j6 + o4;
                    if (j4 == -1 || j7 < j4) {
                        while (true) {
                            long j8 = rVar.f112o;
                            if (j8 < j7) {
                                if (rVar.o(c1316w) != Long.MIN_VALUE) {
                                    long o5 = rVar.o(c1316w);
                                    if (o5 < 0) {
                                        break;
                                    }
                                    if (o5 != 0) {
                                        int i6 = (int) o5;
                                        c1316w.c(i6, false);
                                        rVar.f112o += i6;
                                    }
                                } else {
                                    break;
                                }
                            } else if (j8 == j7) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void e(int i4) {
        if (this.f6886C == null || this.f6887D == null) {
            throw C0907md.a("Element " + i4 + " must be in a Cues", null);
        }
    }

    public final void f(int i4) {
        if (this.f6929u != null) {
            return;
        }
        throw C0907md.a("Element " + i4 + " must be in a TrackEntry", null);
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.f6912b0 = d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0459, code lost:
    
        throw com.google.android.gms.internal.ads.C0907md.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x00c8, code lost:
    
        if (r8 == 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01bf, code lost:
    
        r11 = true;
        r3 = r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:343:0x06d6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00e8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.T0] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46, types: [int] */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.google.android.gms.internal.ads.T0] */
    /* JADX WARN: Type inference failed for: r6v31, types: [com.google.android.gms.internal.ads.w] */
    /* JADX WARN: Type inference failed for: r6v37, types: [com.google.android.gms.internal.ads.w] */
    /* JADX WARN: Type inference failed for: r6v46, types: [com.google.android.gms.internal.ads.w] */
    /* JADX WARN: Type inference failed for: r6v50, types: [com.google.android.gms.internal.ads.w] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object, com.google.android.gms.internal.ads.R0] */
    /* JADX WARN: Type inference failed for: r7v61, types: [com.google.android.gms.internal.ads.w] */
    /* JADX WARN: Type inference failed for: r7v66, types: [com.google.android.gms.internal.ads.w] */
    /* JADX WARN: Type inference failed for: r8v30, types: [com.google.android.gms.internal.ads.w] */
    /* JADX WARN: Type inference failed for: r9v36, types: [com.google.android.gms.internal.ads.w] */
    @Override // com.google.android.gms.internal.ads.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.C r37, com.google.android.gms.internal.ads.F r38) {
        /*
            Method dump skipped, instructions count: 3102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.S0.h(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.F):int");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        this.f6885B = -9223372036854775807L;
        this.f6890G = 0;
        P0 p02 = this.f6909a;
        p02.f6547e = 0;
        p02.f6546b.clear();
        T0 t02 = p02.c;
        t02.f7029a = 0;
        t02.f7030b = 0;
        T0 t03 = this.f6911b;
        t03.f7029a = 0;
        t03.f7030b = 0;
        l();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i4 >= sparseArray.size()) {
                return;
            }
            W w2 = ((R0) sparseArray.valueAt(i4)).f6743U;
            if (w2 != null) {
                w2.f7315b = false;
                w2.c = 0;
            }
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba A[EDGE_INSN: B:45:0x00ba->B:44:0x00ba BREAK  A[LOOP:0: B:37:0x00a9->B:41:0x00b7], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.google.android.gms.internal.ads.R0 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.S0.j(com.google.android.gms.internal.ads.R0, long, int, int, int):void");
    }

    public final void k(C c, int i4) {
        C1134rq c1134rq = this.f6915g;
        if (c1134rq.c >= i4) {
            return;
        }
        byte[] bArr = c1134rq.f10536a;
        if (bArr.length < i4) {
            int length = bArr.length;
            int max = Math.max(length + length, i4);
            byte[] bArr2 = c1134rq.f10536a;
            if (max > bArr2.length) {
                c1134rq.f10536a = Arrays.copyOf(bArr2, max);
            }
        }
        byte[] bArr3 = c1134rq.f10536a;
        int i5 = c1134rq.c;
        ((C1316w) c).C(bArr3, i5, i4 - i5, false);
        c1134rq.d(i4);
    }

    public final void l() {
        this.f6901S = 0;
        this.f6902T = 0;
        this.f6903U = 0;
        this.f6904V = false;
        this.f6905W = false;
        this.f6906X = false;
        this.f6907Y = 0;
        this.f6908Z = (byte) 0;
        this.f6910a0 = false;
        this.f6918j.b(0);
    }

    public final void m(C c, byte[] bArr, int i4) {
        int length = bArr.length;
        int i5 = length + i4;
        C1134rq c1134rq = this.f6919k;
        byte[] bArr2 = c1134rq.f10536a;
        if (bArr2.length < i5) {
            byte[] copyOf = Arrays.copyOf(bArr, i5 + i4);
            c1134rq.c(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        ((C1316w) c).C(c1134rq.f10536a, length, i4, false);
        c1134rq.e(0);
        c1134rq.d(i5);
    }
}
