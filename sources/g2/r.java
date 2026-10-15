package g2;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.Ur;
import e2.C1664b;
import h2.AbstractC1706e;
import h2.C1707f;
import h2.C1711j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r implements A2.d {

    /* renamed from: a, reason: collision with root package name */
    public final C1684d f13022a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13023b;
    public final C1681a c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13024e;

    public r(C1684d c1684d, int i4, C1681a c1681a, long j4, long j5) {
        this.f13022a = c1684d;
        this.f13023b = i4;
        this.c = c1681a;
        this.d = j4;
        this.f13024e = j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h2.C1707f b(g2.m r4, h2.AbstractC1706e r5, int r6) {
        /*
            h2.E r5 = r5.f13172J
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            h2.f r5 = r5.f13143r
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.f13186p
            if (r1 == 0) goto L35
            int[] r1 = r5.f13188r
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f13190t
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.f13016z
            int r6 = r5.f13189s
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.r.b(g2.m, h2.e, int):h2.f");
    }

    @Override // A2.d
    public final void a(A2.h hVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j4;
        long j5;
        long j6 = this.d;
        C1684d c1684d = this.f13022a;
        if (c1684d.a()) {
            h2.l lVar = (h2.l) h2.k.b().f13218o;
            if (lVar == null || lVar.f13220p) {
                m mVar = (m) c1684d.f13000x.get(this.c);
                if (mVar != null) {
                    Object obj = mVar.f13007p;
                    if (obj instanceof AbstractC1706e) {
                        AbstractC1706e abstractC1706e = (AbstractC1706e) obj;
                        int i9 = 0;
                        boolean z4 = j6 > 0;
                        int i10 = abstractC1706e.f13167E;
                        if (lVar != null) {
                            z4 &= lVar.f13221q;
                            i4 = lVar.f13222r;
                            int i11 = lVar.f13223s;
                            int i12 = lVar.f13219o;
                            if (abstractC1706e.f13172J == null || abstractC1706e.g()) {
                                i5 = i12;
                                i6 = i11;
                            } else {
                                C1707f b4 = b(mVar, abstractC1706e, this.f13023b);
                                if (b4 == null) {
                                    return;
                                }
                                boolean z5 = b4.f13187q && j6 > 0;
                                i5 = i12;
                                i6 = b4.f13189s;
                                z4 = z5;
                            }
                        } else {
                            i4 = 5000;
                            i5 = 0;
                            i6 = 100;
                        }
                        int i13 = i4;
                        int i14 = -1;
                        if (hVar.j()) {
                            i8 = 0;
                        } else if (hVar.h()) {
                            i9 = -1;
                            i8 = 100;
                        } else {
                            Exception f4 = hVar.f();
                            if (f4 instanceof f2.d) {
                                Status status = ((f2.d) f4).f12962o;
                                i7 = status.f3898o;
                                C1664b c1664b = status.f3901r;
                                if (c1664b != null) {
                                    i8 = i7;
                                    i9 = c1664b.f12743p;
                                }
                            } else {
                                i7 = 101;
                            }
                            i8 = i7;
                            i9 = -1;
                        }
                        if (z4) {
                            long j7 = this.f13024e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i14 = (int) (SystemClock.elapsedRealtime() - j7);
                            j5 = currentTimeMillis;
                            j4 = j6;
                        } else {
                            j4 = 0;
                            j5 = 0;
                        }
                        s sVar = new s(new C1711j(this.f13023b, i8, i9, j4, j5, null, null, i10, i14), i5, i13, i6);
                        Ur ur = c1684d.f12989A;
                        ur.sendMessage(ur.obtainMessage(18, sVar));
                    }
                }
            }
        }
    }
}
