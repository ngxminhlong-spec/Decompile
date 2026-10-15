package x2;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.C1493b;
import com.google.android.gms.internal.measurement.C1539k0;
import com.google.android.gms.internal.measurement.C1551n0;
import com.google.android.gms.internal.measurement.C1559p0;
import com.google.android.gms.internal.measurement.C1563q0;
import com.google.android.gms.internal.measurement.E1;
import com.google.android.gms.internal.measurement.H1;
import com.google.android.gms.internal.measurement.M1;
import com.google.android.gms.internal.measurement.N1;
import com.google.android.gms.internal.measurement.t3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class O extends T0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(X0 x02, int i4) {
        super(x02);
        this.d = i4;
    }

    public static Bundle B(Map map, boolean z4) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z4) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(B((Map) arrayList.get(i4), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static C2096s D(C1493b c1493b) {
        Object obj;
        Bundle B4 = B(c1493b.c, true);
        String obj2 = (!B4.containsKey("_o") || (obj = B4.get("_o")) == null) ? "app" : obj.toString();
        String f4 = AbstractC2080j0.f(c1493b.f11880a, AbstractC2080j0.f15679a, AbstractC2080j0.c);
        if (f4 == null) {
            f4 = c1493b.f11880a;
        }
        return new C2096s(f4, new r(B4), obj2, c1493b.f11881b);
    }

    public static H1 F(H1 h12, byte[] bArr) {
        A1 a12;
        A1 a13 = A1.f11702a;
        if (a13 == null) {
            synchronized (A1.class) {
                try {
                    a12 = A1.f11702a;
                    if (a12 == null) {
                        a12 = E1.a();
                        A1.f11702a = a12;
                    }
                } finally {
                }
            }
            a13 = a12;
        }
        if (a13 != null) {
            h12.getClass();
            h12.c(bArr, bArr.length, a13);
            return h12;
        }
        h12.getClass();
        h12.c(bArr, bArr.length, A1.f11703b);
        return h12;
    }

    public static ArrayList J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            long j4 = 0;
            for (int i5 = 0; i5 < 64; i5++) {
                int i6 = (i4 * 64) + i5;
                if (i6 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i6)) {
                    j4 |= 1 << i5;
                }
            }
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(K((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(K((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(K((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap K(android.os.Bundle r10, boolean r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r11 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = K(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = K(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.HashMap r3 = K(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.O.K(android.os.Bundle, boolean):java.util.HashMap");
    }

    public static boolean N(M1 m12, int i4) {
        if (i4 < m12.size() * 64) {
            return ((1 << (i4 % 64)) & ((Long) m12.get(i4 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean P(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void R(com.google.android.gms.internal.measurement.D0 d02, String str, Long l4) {
        List unmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.E0) d02.f11739p).s());
        int i4 = 0;
        while (true) {
            if (i4 >= unmodifiableList.size()) {
                i4 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.H0) unmodifiableList.get(i4)).q())) {
                break;
            } else {
                i4++;
            }
        }
        com.google.android.gms.internal.measurement.G0 p3 = com.google.android.gms.internal.measurement.H0.p();
        p3.h(str);
        if (U.a.q(l4)) {
            p3.g(l4.longValue());
        }
        if (i4 < 0) {
            d02.i(p3);
            return;
        }
        if (d02.f11740q) {
            d02.f();
            d02.f11740q = false;
        }
        com.google.android.gms.internal.measurement.E0.t((com.google.android.gms.internal.measurement.E0) d02.f11739p, i4, (com.google.android.gms.internal.measurement.H0) p3.d());
    }

    public static final com.google.android.gms.internal.measurement.H0 k(com.google.android.gms.internal.measurement.E0 e02, String str) {
        for (com.google.android.gms.internal.measurement.H0 h02 : e02.s()) {
            if (h02.q().equals(str)) {
                return h02;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable l(com.google.android.gms.internal.measurement.E0 e02, String str) {
        com.google.android.gms.internal.measurement.H0 k3 = k(e02, str);
        if (k3 == null) {
            return null;
        }
        if (k3.H()) {
            return k3.r();
        }
        if (k3.F()) {
            return Long.valueOf(k3.o());
        }
        if (k3.D()) {
            return Double.valueOf(k3.l());
        }
        if (k3.n() <= 0) {
            return null;
        }
        N1<com.google.android.gms.internal.measurement.H0> s4 = k3.s();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.H0 h02 : s4) {
            if (h02 != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.H0 h03 : h02.s()) {
                    if (h03.H()) {
                        bundle.putString(h03.q(), h03.r());
                    } else if (h03.F()) {
                        bundle.putLong(h03.q(), h03.o());
                    } else if (h03.D()) {
                        bundle.putDouble(h03.q(), h03.l());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void o(int i4, StringBuilder sb) {
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append("  ");
        }
    }

    public static final String p(boolean z4, boolean z5, boolean z6) {
        StringBuilder sb = new StringBuilder();
        if (z4) {
            sb.append("Dynamic ");
        }
        if (z5) {
            sb.append("Sequence ");
        }
        if (z6) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void q(StringBuilder sb, String str, com.google.android.gms.internal.measurement.P0 p02) {
        if (p02 == null) {
            return;
        }
        o(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (p02.m() != 0) {
            o(4, sb);
            sb.append("results: ");
            int i4 = 0;
            for (Long l4 : p02.u()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l4);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (p02.o() != 0) {
            o(4, sb);
            sb.append("status: ");
            int i6 = 0;
            for (Long l5 : p02.w()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(l5);
                i6 = i7;
            }
            sb.append('\n');
        }
        if (p02.l() != 0) {
            o(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i8 = 0;
            for (com.google.android.gms.internal.measurement.C0 c02 : p02.t()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(c02.r() ? Integer.valueOf(c02.l()) : null);
                sb.append(":");
                sb.append(c02.q() ? Long.valueOf(c02.m()) : null);
                i8 = i9;
            }
            sb.append("}\n");
        }
        if (p02.n() != 0) {
            o(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i10 = 0;
            for (com.google.android.gms.internal.measurement.R0 r02 : p02.v()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(r02.s() ? Integer.valueOf(r02.m()) : null);
                sb.append(": [");
                Iterator it = r02.p().iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i13 = i12 + 1;
                    if (i12 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i12 = i13;
                }
                sb.append("]");
                i10 = i11;
            }
            sb.append("}\n");
        }
        o(3, sb);
        sb.append("}\n");
    }

    public static final void r(StringBuilder sb, int i4, String str, Object obj) {
        if (obj == null) {
            return;
        }
        o(i4 + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void s(StringBuilder sb, int i4, String str, C1551n0 c1551n0) {
        if (c1551n0 == null) {
            return;
        }
        o(i4, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c1551n0.q()) {
            int v4 = c1551n0.v();
            r(sb, i4, "comparison_type", v4 != 1 ? v4 != 2 ? v4 != 3 ? v4 != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (c1551n0.s()) {
            r(sb, i4, "match_as_float", Boolean.valueOf(c1551n0.p()));
        }
        if (c1551n0.r()) {
            r(sb, i4, "comparison_value", c1551n0.m());
        }
        if (c1551n0.u()) {
            r(sb, i4, "min_comparison_value", c1551n0.o());
        }
        if (c1551n0.t()) {
            r(sb, i4, "max_comparison_value", c1551n0.n());
        }
        o(i4, sb);
        sb.append("}\n");
    }

    public static int u(com.google.android.gms.internal.measurement.L0 l02, String str) {
        for (int i4 = 0; i4 < ((com.google.android.gms.internal.measurement.M0) l02.f11739p).i1(); i4++) {
            if (str.equals(((com.google.android.gms.internal.measurement.M0) l02.f11739p).v1(i4).p())) {
                return i4;
            }
        }
        return -1;
    }

    private final void x() {
    }

    private final void y() {
    }

    private final void z() {
    }

    public long A(byte[] bArr) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        b1 b1Var = c2066c0.f15571l;
        C2066c0.g(b1Var);
        b1Var.g();
        MessageDigest n4 = b1.n();
        if (n4 != null) {
            return b1.h0(n4.digest(bArr));
        }
        K k3 = c2066c0.f15568i;
        C2066c0.i(k3);
        k3.f15394f.a("Failed to get MD5");
        return 0L;
    }

    public Parcelable C(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (i2.b unused) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15394f.a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public com.google.android.gms.internal.measurement.E0 E(C2089o c2089o) {
        com.google.android.gms.internal.measurement.D0 p3 = com.google.android.gms.internal.measurement.E0.p();
        long j4 = c2089o.f15747e;
        if (p3.f11740q) {
            p3.f();
            p3.f11740q = false;
        }
        com.google.android.gms.internal.measurement.E0.A(j4, (com.google.android.gms.internal.measurement.E0) p3.f11739p);
        r rVar = c2089o.f15748f;
        for (String str : rVar.f15773o.keySet()) {
            com.google.android.gms.internal.measurement.G0 p4 = com.google.android.gms.internal.measurement.H0.p();
            p4.h(str);
            Object obj = rVar.f15773o.get(str);
            h2.y.i(obj);
            L(p4, obj);
            p3.i(p4);
        }
        return (com.google.android.gms.internal.measurement.E0) p3.d();
    }

    public String G(com.google.android.gms.internal.measurement.K0 k02) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.M0 m02 : k02.n()) {
            if (m02 != null) {
                o(1, sb);
                sb.append("bundle {\n");
                if (m02.W0()) {
                    r(sb, 1, "protocol_version", Integer.valueOf(m02.f1()));
                }
                t3.a();
                C2073g c2073g = c2066c0.f15566g;
                G g4 = c2066c0.f15572m;
                if (c2073g.p(null, B.f15316o0) && m02.Z0()) {
                    r(sb, 1, "session_stitching_token", m02.v());
                }
                r(sb, 1, "platform", m02.t());
                if (m02.S0()) {
                    r(sb, 1, "gmp_version", Long.valueOf(m02.n1()));
                }
                if (m02.d1()) {
                    r(sb, 1, "uploading_gmp_version", Long.valueOf(m02.s1()));
                }
                if (m02.Q0()) {
                    r(sb, 1, "dynamite_version", Long.valueOf(m02.l1()));
                }
                if (m02.N0()) {
                    r(sb, 1, "config_version", Long.valueOf(m02.j1()));
                }
                r(sb, 1, "gmp_app_id", m02.q());
                r(sb, 1, "admob_app_id", m02.w1());
                r(sb, 1, "app_id", m02.x1());
                r(sb, 1, "app_version", m02.l());
                if (m02.j0()) {
                    r(sb, 1, "app_version_major", Integer.valueOf(m02.K()));
                }
                r(sb, 1, "firebase_instance_id", m02.p());
                if (m02.P0()) {
                    r(sb, 1, "dev_cert_hash", Long.valueOf(m02.k1()));
                }
                r(sb, 1, "app_store", m02.z1());
                if (m02.c1()) {
                    r(sb, 1, "upload_timestamp_millis", Long.valueOf(m02.r1()));
                }
                if (m02.a1()) {
                    r(sb, 1, "start_timestamp_millis", Long.valueOf(m02.q1()));
                }
                if (m02.R0()) {
                    r(sb, 1, "end_timestamp_millis", Long.valueOf(m02.m1()));
                }
                if (m02.V0()) {
                    r(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(m02.p1()));
                }
                if (m02.U0()) {
                    r(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(m02.o1()));
                }
                r(sb, 1, "app_instance_id", m02.y1());
                r(sb, 1, "resettable_device_id", m02.u());
                r(sb, 1, "ds_id", m02.o());
                if (m02.T0()) {
                    r(sb, 1, "limited_ad_tracking", Boolean.valueOf(m02.h0()));
                }
                r(sb, 1, "os_version", m02.s());
                r(sb, 1, "device_model", m02.n());
                r(sb, 1, "user_default_language", m02.w());
                if (m02.b1()) {
                    r(sb, 1, "time_zone_offset_minutes", Integer.valueOf(m02.h1()));
                }
                if (m02.k0()) {
                    r(sb, 1, "bundle_sequential_index", Integer.valueOf(m02.K0()));
                }
                if (m02.Y0()) {
                    r(sb, 1, "service_upload", Boolean.valueOf(m02.i0()));
                }
                r(sb, 1, "health_monitor", m02.r());
                if (m02.X0()) {
                    r(sb, 1, "retry_counter", Integer.valueOf(m02.g1()));
                }
                if (m02.O0()) {
                    r(sb, 1, "consent_signals", m02.m());
                }
                N1<com.google.android.gms.internal.measurement.T0> z4 = m02.z();
                if (z4 != null) {
                    for (com.google.android.gms.internal.measurement.T0 t02 : z4) {
                        if (t02 != null) {
                            o(2, sb);
                            sb.append("user_property {\n");
                            r(sb, 2, "set_timestamp_millis", t02.B() ? Long.valueOf(t02.n()) : null);
                            r(sb, 2, "name", g4.f(t02.p()));
                            r(sb, 2, "string_value", t02.q());
                            r(sb, 2, "int_value", t02.A() ? Long.valueOf(t02.m()) : null);
                            r(sb, 2, "double_value", t02.z() ? Double.valueOf(t02.l()) : null);
                            o(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                N1<com.google.android.gms.internal.measurement.A0> x4 = m02.x();
                if (x4 != null) {
                    for (com.google.android.gms.internal.measurement.A0 a02 : x4) {
                        if (a02 != null) {
                            o(2, sb);
                            sb.append("audience_membership {\n");
                            if (a02.u()) {
                                r(sb, 2, "audience_id", Integer.valueOf(a02.l()));
                            }
                            if (a02.v()) {
                                r(sb, 2, "new_audience", Boolean.valueOf(a02.t()));
                            }
                            q(sb, "current_data", a02.n());
                            if (a02.w()) {
                                q(sb, "previous_data", a02.o());
                            }
                            o(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                N1<com.google.android.gms.internal.measurement.E0> y = m02.y();
                if (y != null) {
                    for (com.google.android.gms.internal.measurement.E0 e02 : y) {
                        if (e02 != null) {
                            o(2, sb);
                            sb.append("event {\n");
                            r(sb, 2, "name", g4.d(e02.r()));
                            if (e02.D()) {
                                r(sb, 2, "timestamp_millis", Long.valueOf(e02.o()));
                            }
                            if (e02.C()) {
                                r(sb, 2, "previous_timestamp_millis", Long.valueOf(e02.n()));
                            }
                            if (e02.B()) {
                                r(sb, 2, "count", Integer.valueOf(e02.l()));
                            }
                            if (e02.m() != 0) {
                                m(sb, 2, e02.s());
                            }
                            o(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                o(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    public String H(C1559p0 c1559p0) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (c1559p0.t()) {
            r(sb, 0, "filter_id", Integer.valueOf(c1559p0.l()));
        }
        r(sb, 0, "property_name", ((C2066c0) this.f1719a).f15572m.f(c1559p0.o()));
        String p3 = p(c1559p0.q(), c1559p0.r(), c1559p0.s());
        if (!p3.isEmpty()) {
            r(sb, 0, "filter_type", p3);
        }
        n(sb, 1, c1559p0.m());
        sb.append("}\n");
        return sb.toString();
    }

    public List I(M1 m12, List list) {
        int i4;
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        ArrayList arrayList = new ArrayList(m12);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                K k3 = c2066c0.f15568i;
                C2066c0.i(k3);
                k3.f15397i.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    K k4 = c2066c0.f15568i;
                    C2066c0.i(k4);
                    k4.f15397i.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i5 = size2;
            i4 = size;
            size = i5;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i4);
    }

    public void L(com.google.android.gms.internal.measurement.G0 g02, Object obj) {
        if (g02.f11740q) {
            g02.f();
            g02.f11740q = false;
        }
        com.google.android.gms.internal.measurement.H0.v((com.google.android.gms.internal.measurement.H0) g02.f11739p);
        if (g02.f11740q) {
            g02.f();
            g02.f11740q = false;
        }
        com.google.android.gms.internal.measurement.H0.x((com.google.android.gms.internal.measurement.H0) g02.f11739p);
        if (g02.f11740q) {
            g02.f();
            g02.f11740q = false;
        }
        com.google.android.gms.internal.measurement.H0.z((com.google.android.gms.internal.measurement.H0) g02.f11739p);
        if (g02.f11740q) {
            g02.f();
            g02.f11740q = false;
        }
        com.google.android.gms.internal.measurement.H0.C((com.google.android.gms.internal.measurement.H0) g02.f11739p);
        if (obj instanceof String) {
            g02.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            g02.g(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (g02.f11740q) {
                g02.f();
                g02.f11740q = false;
            }
            com.google.android.gms.internal.measurement.H0.y((com.google.android.gms.internal.measurement.H0) g02.f11739p, doubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15394f.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.G0 p3 = com.google.android.gms.internal.measurement.H0.p();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.G0 p4 = com.google.android.gms.internal.measurement.H0.p();
                    p4.h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        p4.g(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        p4.i((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double doubleValue2 = ((Double) obj2).doubleValue();
                        if (p4.f11740q) {
                            p4.f();
                            p4.f11740q = false;
                        }
                        com.google.android.gms.internal.measurement.H0.y((com.google.android.gms.internal.measurement.H0) p4.f11739p, doubleValue2);
                    }
                    if (p3.f11740q) {
                        p3.f();
                        p3.f11740q = false;
                    }
                    com.google.android.gms.internal.measurement.H0.A((com.google.android.gms.internal.measurement.H0) p3.f11739p, (com.google.android.gms.internal.measurement.H0) p4.d());
                }
                if (((com.google.android.gms.internal.measurement.H0) p3.f11739p).n() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.H0) p3.d());
                }
            }
        }
        if (g02.f11740q) {
            g02.f();
            g02.f11740q = false;
        }
        com.google.android.gms.internal.measurement.H0.B((com.google.android.gms.internal.measurement.H0) g02.f11739p, arrayList);
    }

    public void M(com.google.android.gms.internal.measurement.S0 s02, Object obj) {
        h2.y.i(obj);
        if (s02.f11740q) {
            s02.f();
            s02.f11740q = false;
        }
        com.google.android.gms.internal.measurement.T0.u((com.google.android.gms.internal.measurement.T0) s02.f11739p);
        if (s02.f11740q) {
            s02.f();
            s02.f11740q = false;
        }
        com.google.android.gms.internal.measurement.T0.w((com.google.android.gms.internal.measurement.T0) s02.f11739p);
        if (s02.f11740q) {
            s02.f();
            s02.f11740q = false;
        }
        com.google.android.gms.internal.measurement.T0.y((com.google.android.gms.internal.measurement.T0) s02.f11739p);
        if (obj instanceof String) {
            String str = (String) obj;
            if (s02.f11740q) {
                s02.f();
                s02.f11740q = false;
            }
            com.google.android.gms.internal.measurement.T0.t((com.google.android.gms.internal.measurement.T0) s02.f11739p, str);
            return;
        }
        if (obj instanceof Long) {
            s02.g(((Long) obj).longValue());
            return;
        }
        if (!(obj instanceof Double)) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15394f.b(obj, "Ignoring invalid (type) user attribute value");
        } else {
            double doubleValue = ((Double) obj).doubleValue();
            if (s02.f11740q) {
                s02.f();
                s02.f11740q = false;
            }
            com.google.android.gms.internal.measurement.T0.x((com.google.android.gms.internal.measurement.T0) s02.f11739p, doubleValue);
        }
    }

    public boolean O(long j4, long j5) {
        if (j4 == 0 || j5 <= 0) {
            return true;
        }
        ((C2066c0) this.f1719a).f15573n.getClass();
        return Math.abs(System.currentTimeMillis() - j4) > j5;
    }

    public byte[] Q(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15394f.b(e4, "Failed to gzip content");
            throw e4;
        }
    }

    @Override // x2.T0
    public final void j() {
        int i4 = this.d;
    }

    public void m(StringBuilder sb, int i4, N1 n12) {
        if (n12 == null) {
            return;
        }
        int i5 = i4 + 1;
        Iterator it = n12.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.H0 h02 = (com.google.android.gms.internal.measurement.H0) it.next();
            if (h02 != null) {
                o(i5, sb);
                sb.append("param {\n");
                r(sb, i5, "name", h02.G() ? ((C2066c0) this.f1719a).f15572m.e(h02.q()) : null);
                r(sb, i5, "string_value", h02.H() ? h02.r() : null);
                r(sb, i5, "int_value", h02.F() ? Long.valueOf(h02.o()) : null);
                r(sb, i5, "double_value", h02.D() ? Double.valueOf(h02.l()) : null);
                if (h02.n() > 0) {
                    m(sb, i5, h02.s());
                }
                o(i5, sb);
                sb.append("}\n");
            }
        }
    }

    public void n(StringBuilder sb, int i4, C1539k0 c1539k0) {
        String str;
        if (c1539k0 == null) {
            return;
        }
        o(i4, sb);
        sb.append("filter {\n");
        if (c1539k0.r()) {
            r(sb, i4, "complement", Boolean.valueOf(c1539k0.q()));
        }
        if (c1539k0.t()) {
            r(sb, i4, "param_name", ((C2066c0) this.f1719a).f15572m.e(c1539k0.o()));
        }
        if (c1539k0.u()) {
            int i5 = i4 + 1;
            C1563q0 n4 = c1539k0.n();
            if (n4 != null) {
                o(i5, sb);
                sb.append("string_filter {\n");
                if (n4.s()) {
                    switch (n4.t()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    r(sb, i5, "match_type", str);
                }
                if (n4.r()) {
                    r(sb, i5, "expression", n4.n());
                }
                if (n4.q()) {
                    r(sb, i5, "case_sensitive", Boolean.valueOf(n4.p()));
                }
                if (n4.l() > 0) {
                    o(i4 + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : n4.o()) {
                        o(i4 + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                o(i5, sb);
                sb.append("}\n");
            }
        }
        if (c1539k0.s()) {
            s(sb, i4 + 1, "number_filter", c1539k0.m());
        }
        o(i4, sb);
        sb.append("}\n");
    }

    public boolean v() {
        h();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C2066c0) this.f1719a).f15562a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
