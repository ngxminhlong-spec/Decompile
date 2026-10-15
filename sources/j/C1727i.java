package j;

import H.G;
import l.G0;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1727i extends AbstractC1806a {

    /* renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ int f13318n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f13319o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f13320p0;

    /* renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f13321q0;

    public C1727i(C1728j c1728j) {
        this.f13318n0 = 0;
        this.f13321q0 = c1728j;
        this.f13319o0 = false;
        this.f13320p0 = 0;
    }

    public C1727i(G0 g02, int i4) {
        this.f13318n0 = 1;
        this.f13321q0 = g02;
        this.f13320p0 = i4;
        this.f13319o0 = false;
    }

    @Override // H.G
    public final void a() {
        switch (this.f13318n0) {
            case 0:
                int i4 = this.f13320p0 + 1;
                this.f13320p0 = i4;
                C1728j c1728j = (C1728j) this.f13321q0;
                if (i4 == c1728j.f13322a.size()) {
                    G g4 = c1728j.d;
                    if (g4 != null) {
                        g4.a();
                    }
                    this.f13320p0 = 0;
                    this.f13319o0 = false;
                    c1728j.f13324e = false;
                    return;
                }
                return;
            default:
                if (this.f13319o0) {
                    return;
                }
                ((G0) this.f13321q0).f13603a.setVisibility(this.f13320p0);
                return;
        }
    }

    @Override // m2.AbstractC1806a, H.G
    public void b() {
        switch (this.f13318n0) {
            case 1:
                this.f13319o0 = true;
                return;
            default:
                return;
        }
    }

    @Override // m2.AbstractC1806a, H.G
    public final void c() {
        switch (this.f13318n0) {
            case 0:
                if (this.f13319o0) {
                    return;
                }
                this.f13319o0 = true;
                G g4 = ((C1728j) this.f13321q0).d;
                if (g4 != null) {
                    g4.c();
                    return;
                }
                return;
            default:
                ((G0) this.f13321q0).f13603a.setVisibility(0);
                return;
        }
    }
}
