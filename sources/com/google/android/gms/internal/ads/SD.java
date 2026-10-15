package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class SD {

    /* renamed from: a, reason: collision with root package name */
    public final String f6957a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6958b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6959e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6960f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6961g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6962h;

    public SD(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f6957a = str;
        this.f6958b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.f6961g = z4;
        this.f6959e = z5;
        this.f6960f = z6;
        this.f6962h = "video".equals(AbstractC0438bd.f(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.SD b(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13) {
        /*
            com.google.android.gms.internal.ads.SD r0 = new com.google.android.gms.internal.ads.SD
            r1 = 1
            r2 = 0
            if (r11 == 0) goto L3b
            int r3 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r11.isFeatureSupported(r3)
            if (r3 == 0) goto L3b
            int r3 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            r4 = 22
            if (r3 > r4) goto L29
            java.lang.String r3 = com.google.android.gms.internal.ads.AbstractC0751is.d
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L2b
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L29
            goto L2b
        L29:
            r6 = r1
            goto L3c
        L2b:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L29
        L3b:
            r6 = r2
        L3c:
            r3 = 21
            if (r11 == 0) goto L49
            int r4 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            if (r4 < r3) goto L49
            java.lang.String r4 = "tunneled-playback"
            r11.isFeatureSupported(r4)
        L49:
            if (r13 != 0) goto L59
            if (r11 == 0) goto L60
            int r13 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            if (r13 < r3) goto L60
            java.lang.String r13 = "secure-playback"
            boolean r13 = r11.isFeatureSupported(r13)
            if (r13 == 0) goto L60
        L59:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r1
            r1 = r8
            goto L66
        L60:
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r2
            r2 = r9
        L66:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.SD.b(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):com.google.android.gms.internal.ads.SD");
    }

    public static Point f(MediaCodecInfo.VideoCapabilities videoCapabilities, int i4, int i5) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i6 = AbstractC0751is.f9071a;
        return new Point((((i4 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i5 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public static boolean h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i4, int i5, double d) {
        Point f4 = f(videoCapabilities, i4, i5);
        int i6 = f4.x;
        int i7 = f4.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i6, i7) : videoCapabilities.areSizeAndRateSupported(i6, i7, Math.floor(d));
    }

    public final WB a(C0976o2 c0976o2, C0976o2 c0976o22) {
        C0976o2 c0976o23;
        C0976o2 c0976o24;
        int i4 = true != AbstractC0751is.c(c0976o2.f9813k, c0976o22.f9813k) ? 8 : 0;
        if (this.f6962h) {
            if (c0976o2.f9821s != c0976o22.f9821s) {
                i4 |= 1024;
            }
            if (!this.f6959e && (c0976o2.f9818p != c0976o22.f9818p || c0976o2.f9819q != c0976o22.f9819q)) {
                i4 |= 512;
            }
            if (!AbstractC0751is.c(c0976o2.f9825w, c0976o22.f9825w)) {
                i4 |= 2048;
            }
            if (AbstractC0751is.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f6957a) && !c0976o2.a(c0976o22)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new WB(this.f6957a, c0976o2, c0976o22, true != c0976o2.a(c0976o22) ? 2 : 3, 0);
            }
            c0976o23 = c0976o2;
            c0976o24 = c0976o22;
        } else {
            c0976o23 = c0976o2;
            c0976o24 = c0976o22;
            if (c0976o23.f9826x != c0976o24.f9826x) {
                i4 |= 4096;
            }
            if (c0976o23.y != c0976o24.y) {
                i4 |= 8192;
            }
            if (c0976o23.f9827z != c0976o24.f9827z) {
                i4 |= 16384;
            }
            String str = this.f6958b;
            if (i4 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair b4 = AbstractC0518dE.b(c0976o23);
                Pair b5 = AbstractC0518dE.b(c0976o24);
                if (b4 != null && b5 != null) {
                    int intValue = ((Integer) b4.first).intValue();
                    int intValue2 = ((Integer) b5.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new WB(this.f6957a, c0976o23, c0976o24, 3, 0);
                    }
                }
            }
            if (!c0976o23.a(c0976o24)) {
                i4 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new WB(this.f6957a, c0976o23, c0976o24, 1, 0);
            }
        }
        return new WB(this.f6957a, c0976o23, c0976o24, 0, i4);
    }

    public final boolean c(C0976o2 c0976o2) {
        String str = c0976o2.f9813k;
        String str2 = this.f6958b;
        boolean z4 = str2.equals(str) || str2.equals(AbstractC0518dE.c(c0976o2));
        int i4 = c0976o2.f9819q;
        int i5 = c0976o2.f9818p;
        if (!z4 || !i(c0976o2, true)) {
            return false;
        }
        if (!this.f6962h) {
            int i6 = AbstractC0751is.f9071a;
            if (i6 >= 21) {
                int i7 = c0976o2.y;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (i7 != -1) {
                    if (codecCapabilities == null) {
                        g("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("sampleRate.aCaps");
                        return false;
                    }
                    if (!audioCapabilities.isSampleRateSupported(i7)) {
                        g("sampleRate.support, " + i7);
                        return false;
                    }
                }
                int i8 = c0976o2.f9826x;
                if (i8 != -1) {
                    if (codecCapabilities == null) {
                        g("channelCount.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        g("channelCount.aCaps");
                        return false;
                    }
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i6 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        int i9 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                        Wj.l("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f6957a + ", [" + maxInputChannelCount + " to " + i9 + "]");
                        maxInputChannelCount = i9;
                    }
                    if (maxInputChannelCount < i8) {
                        g("channelCount.support, " + i8);
                        return false;
                    }
                }
            }
        } else if (i5 > 0 && i4 > 0) {
            if (AbstractC0751is.f9071a >= 21) {
                return e(i5, i4, c0976o2.f9820r);
            }
            boolean z5 = i5 * i4 <= AbstractC0518dE.a();
            if (!z5) {
                g("legacyFrameSize, " + i5 + "x" + i4);
            }
            return z5;
        }
        return true;
    }

    public final boolean d(C0976o2 c0976o2) {
        if (this.f6962h) {
            return this.f6959e;
        }
        Pair b4 = AbstractC0518dE.b(c0976o2);
        return b4 != null && ((Integer) b4.first).intValue() == 42;
    }

    public final boolean e(int i4, int i5, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (AbstractC0751is.f9071a >= 29) {
            int a4 = RD.a(videoCapabilities, i4, i5, d);
            if (a4 != 2) {
                if (a4 == 1) {
                    StringBuilder m4 = U.a.m("sizeAndRate.cover, ", i4, "x", i5, "@");
                    m4.append(d);
                    g(m4.toString());
                    return false;
                }
            }
            return true;
        }
        if (!h(videoCapabilities, i4, i5, d)) {
            if (i4 < i5) {
                String str = this.f6957a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(AbstractC0751is.f9072b)) && h(videoCapabilities, i5, i4, d)) {
                    StringBuilder m5 = U.a.m("sizeAndRate.rotated, ", i4, "x", i5, "@");
                    m5.append(d);
                    String sb = m5.toString();
                    String str2 = AbstractC0751is.f9073e;
                    StringBuilder n4 = U.a.n("AssumedSupport [", sb, "] [", str, ", ");
                    n4.append(this.f6958b);
                    n4.append("] [");
                    n4.append(str2);
                    n4.append("]");
                    Wj.f("MediaCodecInfo", n4.toString());
                }
            }
            StringBuilder m6 = U.a.m("sizeAndRate.support, ", i4, "x", i5, "@");
            m6.append(d);
            g(m6.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        Wj.f("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f6957a + ", " + this.f6958b + "] [" + AbstractC0751is.f9073e + "]");
    }

    public final boolean i(C0976o2 c0976o2, boolean z4) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair b4 = AbstractC0518dE.b(c0976o2);
        if (b4 != null) {
            int intValue = ((Integer) b4.first).intValue();
            int intValue2 = ((Integer) b4.second).intValue();
            boolean equals = "video/dolby-vision".equals(c0976o2.f9813k);
            int i4 = 8;
            String str = this.f6958b;
            if (equals) {
                if ("video/avc".equals(str)) {
                    intValue = 8;
                } else if ("video/hevc".equals(str)) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (!this.f6962h) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            if (AbstractC0751is.f9071a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                if (intValue3 >= 180000000) {
                    i4 = 1024;
                } else if (intValue3 >= 120000000) {
                    i4 = 512;
                } else if (intValue3 >= 60000000) {
                    i4 = 256;
                } else if (intValue3 >= 30000000) {
                    i4 = 128;
                } else if (intValue3 >= 18000000) {
                    i4 = 64;
                } else if (intValue3 >= 12000000) {
                    i4 = 32;
                } else if (intValue3 >= 7200000) {
                    i4 = 16;
                } else if (intValue3 < 3600000) {
                    i4 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i4;
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z4)) {
                    if ("video/hevc".equals(str) && intValue == 2) {
                        String str2 = AbstractC0751is.f9072b;
                        if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                        }
                    }
                }
            }
            g("codec.profileLevel, " + c0976o2.f9810h + ", " + this.c);
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f6957a;
    }
}
