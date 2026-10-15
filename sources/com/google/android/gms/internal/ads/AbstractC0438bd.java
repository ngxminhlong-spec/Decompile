package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0438bd {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f8258a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f8259b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r3, java.lang.String r4) {
        /*
            int r0 = r3.hashCode()
            r1 = 8
            r2 = 0
            switch(r0) {
                case -2123537834: goto L8a;
                case -1365340241: goto L81;
                case -1095064472: goto L77;
                case -53558318: goto L60;
                case 187078296: goto L56;
                case 187078297: goto L4b;
                case 550520934: goto L40;
                case 1504578661: goto L36;
                case 1504831518: goto L2b;
                case 1504891608: goto L20;
                case 1505942594: goto L17;
                case 1556697186: goto Lc;
                default: goto La;
            }
        La:
            goto L95
        Lc:
            java.lang.String r4 = "audio/true-hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 14
            return r3
        L17:
            java.lang.String r4 = "audio/vnd.dts.hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            return r1
        L20:
            java.lang.String r4 = "audio/opus"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 20
            return r3
        L2b:
            java.lang.String r4 = "audio/mpeg"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 9
            return r3
        L36:
            java.lang.String r4 = "audio/eac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 6
            return r3
        L40:
            java.lang.String r4 = "audio/vnd.dts.uhd;profile=p2"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 30
            return r3
        L4b:
            java.lang.String r4 = "audio/ac4"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 17
            return r3
        L56:
            java.lang.String r4 = "audio/ac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 5
            return r3
        L60:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L95
            if (r4 != 0) goto L6b
            return r2
        L6b:
            n0.n r3 = c(r4)
            if (r3 != 0) goto L72
            return r2
        L72:
            int r3 = r3.j()
            return r3
        L77:
            java.lang.String r4 = "audio/vnd.dts"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 7
            return r3
        L81:
            java.lang.String r4 = "audio/vnd.dts.hd;profile=lbr"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            return r1
        L8a:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L95
            r3 = 18
            return r3
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0438bd.a(java.lang.String, java.lang.String):int");
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(f(str))) {
            return 1;
        }
        if ("video".equals(f(str))) {
            return 2;
        }
        if ("text".equals(f(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(f(str)) || "application/x-image-uri".equals(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f8258a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static n0.n c(String str) {
        Matcher matcher = f8259b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            Integer.parseInt(group, 16);
            return new n0.n(group2 != null ? Integer.parseInt(group2) : 0, 2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String d(int i4) {
        if (i4 == 32) {
            return "video/mp4v-es";
        }
        if (i4 == 33) {
            return "video/avc";
        }
        if (i4 == 35) {
            return "video/hevc";
        }
        if (i4 == 64) {
            return "audio/mp4a-latm";
        }
        if (i4 == 163) {
            return "video/wvc1";
        }
        if (i4 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i4 == 221) {
            return "audio/vorbis";
        }
        if (i4 == 165) {
            return "audio/ac3";
        }
        if (i4 == 166) {
            return "audio/eac3";
        }
        switch (i4) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i4) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0087 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.hashCode()
            r2 = 1
            switch(r1) {
                case -2123537834: goto L7f;
                case -432837260: goto L76;
                case -432837259: goto L6d;
                case -53558318: goto L4f;
                case 187078296: goto L46;
                case 187094639: goto L3d;
                case 1504578661: goto L34;
                case 1504619009: goto L2b;
                case 1504831518: goto L22;
                case 1903231877: goto L18;
                case 1903589369: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L88
        Le:
            java.lang.String r4 = "audio/g711-mlaw"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L88
            goto L87
        L18:
            java.lang.String r4 = "audio/g711-alaw"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L88
            goto L87
        L22:
            java.lang.String r4 = "audio/mpeg"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L88
            goto L87
        L2b:
            java.lang.String r4 = "audio/flac"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L88
            goto L87
        L34:
            java.lang.String r4 = "audio/eac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L88
            goto L87
        L3d:
            java.lang.String r4 = "audio/raw"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L88
            goto L87
        L46:
            java.lang.String r4 = "audio/ac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L88
            goto L87
        L4f:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L88
            if (r4 != 0) goto L5a
            return r0
        L5a:
            n0.n r3 = c(r4)
            if (r3 != 0) goto L61
            return r0
        L61:
            int r3 = r3.j()
            if (r3 == 0) goto L6c
            r4 = 16
            if (r3 == r4) goto L6c
            return r2
        L6c:
            return r0
        L6d:
            java.lang.String r4 = "audio/mpeg-L2"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L88
            goto L87
        L76:
            java.lang.String r4 = "audio/mpeg-L1"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L88
            goto L87
        L7f:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L88
        L87:
            return r2
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0438bd.e(java.lang.String, java.lang.String):boolean");
    }

    public static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
