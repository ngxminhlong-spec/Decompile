package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589f0 implements InterfaceC0376a0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1137rt f8667a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8668b;

    public C0589f0(int i4, Gt gt) {
        this.f8668b = i4;
        this.f8667a = gt;
    }

    public static C0589f0 c(int i4, C1134rq c1134rq) {
        String str;
        InterfaceC0376a0 c0632g0;
        String str2;
        int i5 = 4;
        Object[] objArr = new Object[4];
        int i6 = c1134rq.c;
        int i7 = 0;
        char c = 65534;
        int i8 = 0;
        while (c1134rq.g() > 8) {
            int i9 = c1134rq.i();
            int i10 = c1134rq.f10537b + c1134rq.i();
            c1134rq.d(i10);
            if (i9 == 1414744396) {
                c0632g0 = c(c1134rq.i(), c1134rq);
            } else {
                C0504d0 c0504d0 = null;
                switch (i9) {
                    case 1718776947:
                        if (c != 2) {
                            if (c != 1) {
                                int i11 = AbstractC0751is.f9071a;
                                switch (c) {
                                    case 65534:
                                        str = "none";
                                        break;
                                    case 65535:
                                        str = "unknown";
                                        break;
                                    case 0:
                                        str = "default";
                                        break;
                                    case 1:
                                        str = "audio";
                                        break;
                                    case 2:
                                        str = "video";
                                        break;
                                    case 3:
                                        str = "text";
                                        break;
                                    case 4:
                                        str = "image";
                                        break;
                                    case 5:
                                        str = "metadata";
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                Wj.l("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                                break;
                            } else {
                                int k3 = c1134rq.k();
                                String str3 = k3 != 1 ? k3 != 85 ? k3 != 255 ? k3 != 8192 ? k3 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str3 != null) {
                                    int k4 = c1134rq.k();
                                    int i12 = c1134rq.i();
                                    c1134rq.f(6);
                                    int q4 = AbstractC0751is.q(c1134rq.q());
                                    int k5 = c1134rq.k();
                                    byte[] bArr = new byte[k5];
                                    c1134rq.a(bArr, i7, k5);
                                    L1 l12 = new L1();
                                    l12.f6101j = str3;
                                    l12.f6114w = k4;
                                    l12.f6115x = i12;
                                    if ("audio/raw".equals(str3) && q4 != 0) {
                                        l12.y = q4;
                                    }
                                    if ("audio/mp4a-latm".equals(str3) && k5 > 0) {
                                        l12.f6103l = AbstractC1137rt.t(bArr);
                                    }
                                    c0632g0 = new C0632g0(new C0976o2(l12));
                                    break;
                                } else {
                                    U.a.p(k3, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                    break;
                                }
                            }
                        } else {
                            c1134rq.f(i5);
                            int i13 = c1134rq.i();
                            int i14 = c1134rq.i();
                            c1134rq.f(i5);
                            int i15 = c1134rq.i();
                            switch (i15) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                L1 l13 = new L1();
                                l13.f6106o = i13;
                                l13.f6107p = i14;
                                l13.f6101j = str2;
                                c0632g0 = new C0632g0(new C0976o2(l13));
                                break;
                            } else {
                                U.a.p(i15, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                break;
                            }
                        }
                    case 1751742049:
                        int i16 = c1134rq.i();
                        c1134rq.f(8);
                        int i17 = c1134rq.i();
                        int i18 = c1134rq.i();
                        c1134rq.f(i5);
                        c1134rq.i();
                        c1134rq.f(12);
                        c0632g0 = new C0461c0(i16, i17, i18);
                        break;
                    case 1752331379:
                        int i19 = c1134rq.i();
                        c1134rq.f(12);
                        c1134rq.i();
                        int i20 = c1134rq.i();
                        int i21 = c1134rq.i();
                        c1134rq.f(i5);
                        int i22 = c1134rq.i();
                        int i23 = c1134rq.i();
                        c1134rq.f(8);
                        c0504d0 = new C0504d0(i19, i20, i21, i22, i23);
                        break;
                    case 1852994675:
                        c0632g0 = new C0675h0(c1134rq.z(c1134rq.g(), AbstractC1480zs.c));
                        break;
                }
                c0632g0 = c0504d0;
            }
            if (c0632g0 != null) {
                if (c0632g0.b() == 1752331379) {
                    int i24 = ((C0504d0) c0632g0).f8432a;
                    if (i24 == 1935960438) {
                        c = 2;
                    } else if (i24 == 1935963489) {
                        c = 1;
                    } else if (i24 != 1937012852) {
                        Wj.l("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i24))));
                        c = 65535;
                    } else {
                        c = 3;
                    }
                }
                int i25 = i8 + 1;
                int length = objArr.length;
                if (length < i25) {
                    objArr = Arrays.copyOf(objArr, AbstractC0880lt.d(length, i25));
                }
                objArr[i8] = c0632g0;
                i8 = i25;
            }
            c1134rq.e(i10);
            c1134rq.d(i6);
            i5 = 4;
            i7 = 0;
        }
        return new C0589f0(i4, AbstractC1137rt.q(i8, objArr));
    }

    public final InterfaceC0376a0 a(Class cls) {
        AbstractC1137rt abstractC1137rt = this.f8667a;
        int size = abstractC1137rt.size();
        int i4 = 0;
        while (i4 < size) {
            InterfaceC0376a0 interfaceC0376a0 = (InterfaceC0376a0) abstractC1137rt.get(i4);
            i4++;
            if (interfaceC0376a0.getClass() == cls) {
                return interfaceC0376a0;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0376a0
    public final int b() {
        return this.f8668b;
    }
}
