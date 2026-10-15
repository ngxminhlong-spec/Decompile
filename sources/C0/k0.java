package C0;

import androidx.recyclerview.widget.RecyclerView;
import b0.AbstractC0182P;
import b0.C0196i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k0 extends AbstractC0182P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f338b;

    public /* synthetic */ k0(int i4, Object obj) {
        this.f337a = i4;
        this.f338b = obj;
    }

    @Override // b0.AbstractC0182P
    public final void b(RecyclerView recyclerView, int i4, int i5) {
        switch (this.f337a) {
            case 0:
                ((l0) this.f338b).f341e.setTranslationY(-r9.f340b.computeVerticalScrollOffset());
                return;
            case 1:
                ((l0) this.f338b).f341e.setTranslationY(-r9.f340b.computeVerticalScrollOffset());
                return;
            default:
                C0196i c0196i = (C0196i) this.f338b;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i6 = c0196i.f3301a;
                int computeVerticalScrollRange = c0196i.f3317s.computeVerticalScrollRange();
                int i7 = c0196i.f3316r;
                c0196i.f3318t = computeVerticalScrollRange - i7 > 0 && i7 >= i6;
                int computeHorizontalScrollRange = c0196i.f3317s.computeHorizontalScrollRange();
                int i8 = c0196i.f3315q;
                boolean z4 = computeHorizontalScrollRange - i8 > 0 && i8 >= i6;
                c0196i.f3319u = z4;
                boolean z5 = c0196i.f3318t;
                if (!z5 && !z4) {
                    if (c0196i.f3320v != 0) {
                        c0196i.j(0);
                        return;
                    }
                    return;
                }
                if (z5) {
                    float f4 = i7;
                    c0196i.f3310l = (int) ((((f4 / 2.0f) + computeVerticalScrollOffset) * f4) / computeVerticalScrollRange);
                    c0196i.f3309k = Math.min(i7, (i7 * i7) / computeVerticalScrollRange);
                }
                if (c0196i.f3319u) {
                    float f5 = computeHorizontalScrollOffset;
                    float f6 = i8;
                    c0196i.f3313o = (int) ((((f6 / 2.0f) + f5) * f6) / computeHorizontalScrollRange);
                    c0196i.f3312n = Math.min(i8, (i8 * i8) / computeHorizontalScrollRange);
                }
                int i9 = c0196i.f3320v;
                if (i9 == 0 || i9 == 1) {
                    c0196i.j(1);
                    return;
                }
                return;
        }
    }
}
