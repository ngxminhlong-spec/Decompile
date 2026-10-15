package s1;

import android.graphics.RectF;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import e1.C1660a;
import h1.AbstractC1698a;
import j1.C1729a;
import java.util.ArrayList;
import o2.AbstractC1895f;
import p1.Q;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: s1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1975e {

    /* renamed from: a, reason: collision with root package name */
    public float f14766a;

    /* renamed from: b, reason: collision with root package name */
    public float f14767b;
    public float c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14768e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f14769f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ BoardView f14770g;

    public C1975e(BoardView boardView) {
        this.f14770g = boardView;
    }

    public final void a(float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        BoardView boardView = this.f14770g;
        C1976f c1976f = boardView.f3829w;
        if (this.f14768e) {
            boolean z4 = boardView.f3800F;
            RectF rectF = this.f14769f;
            if (z4) {
                C1995b c1995b = boardView.f3821o;
                c1995b.getClass();
                float f14 = 0.0f;
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                RectF rectF2 = new RectF();
                C1660a c1660a = (C1660a) c1995b.f14886u;
                int size = c1660a.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = c1660a.get(i4);
                    i4++;
                    j1.c cVar = (j1.c) obj;
                    if (cVar instanceof C1729a) {
                        AbstractC1698a abstractC1698a = ((C1729a) cVar).f13326o;
                        if (!(abstractC1698a instanceof Q)) {
                            if (rectF.width() == f14) {
                                rectF.set(abstractC1698a.f13124q, abstractC1698a.f13125r, abstractC1698a.f13126s, abstractC1698a.f13127t);
                            } else {
                                abstractC1698a.l(rectF2);
                                rectF.set(Math.min(rectF2.left, rectF.left), Math.max(rectF2.top, rectF.top), Math.max(rectF2.right, rectF.right), Math.min(rectF2.bottom, rectF.bottom));
                            }
                        }
                    }
                    f14 = 0.0f;
                }
                c1976f.f14773e = false;
                c1976f.f14774f = false;
                float f15 = c1976f.f14776h.f3816W;
                ArrayList arrayList = c1976f.f14772b;
                int size2 = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    Long l4 = (Long) obj2;
                    if (Math.abs(rectF.left - ((float) l4.longValue())) < f15) {
                        c1976f.c = l4.longValue();
                        c1976f.f14773e = true;
                        break;
                    } else if (Math.abs(rectF.right - ((float) l4.longValue())) < f15) {
                        c1976f.f14773e = true;
                        c1976f.c = l4.longValue();
                        break;
                    }
                }
                ArrayList arrayList2 = c1976f.f14771a;
                int size3 = arrayList2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size3) {
                        break;
                    }
                    Object obj3 = arrayList2.get(i6);
                    i6++;
                    Long l5 = (Long) obj3;
                    if (Math.abs(rectF.top - ((float) l5.longValue())) < f15) {
                        c1976f.d = l5.longValue();
                        c1976f.f14774f = true;
                        break;
                    } else if (Math.abs(rectF.bottom - ((float) l5.longValue())) < f15) {
                        c1976f.d = l5.longValue();
                        c1976f.f14774f = true;
                        break;
                    }
                }
                if (boardView.f3821o.e()) {
                    c1976f.f14774f = false;
                    c1976f.f14773e = false;
                }
            }
            if (c1976f.f14773e && Math.abs(f4 - this.c) < boardView.f3817a0 && c1976f.f14774f && Math.abs(f5 - this.d) < boardView.f3817a0) {
                if (Math.abs(((float) c1976f.c) - rectF.left) < Math.abs(((float) c1976f.c) - rectF.right)) {
                    f10 = (float) c1976f.c;
                    f11 = rectF.left;
                } else {
                    f10 = (float) c1976f.c;
                    f11 = rectF.right;
                }
                float f16 = f10 - f11;
                if (Math.abs(((float) c1976f.d) - rectF.top) < Math.abs(((float) c1976f.d) - rectF.bottom)) {
                    f12 = (float) c1976f.d;
                    f13 = rectF.top;
                } else {
                    f12 = (float) c1976f.d;
                    f13 = rectF.bottom;
                }
                float f17 = f12 - f13;
                boardView.f3821o.l(f16, f17);
                this.d += f17;
                this.c += f16;
                boardView.invalidate();
                return;
            }
            if (c1976f.f14773e && Math.abs(f4 - this.c) < boardView.f3817a0) {
                if (Math.abs(((float) c1976f.c) - rectF.left) < Math.abs(((float) c1976f.c) - rectF.right)) {
                    f8 = (float) c1976f.c;
                    f9 = rectF.left;
                } else {
                    f8 = (float) c1976f.c;
                    f9 = rectF.right;
                }
                float f18 = f8 - f9;
                boardView.f3821o.l(f18, f5 - this.d);
                this.c += f18;
                this.d = f5;
                boardView.invalidate();
                return;
            }
            if (!c1976f.f14774f || Math.abs(f5 - this.d) >= boardView.f3817a0) {
                boardView.f3821o.l(f4 - this.c, f5 - this.d);
                this.c = f4;
                this.d = f5;
                boardView.invalidate();
                return;
            }
            if (Math.abs(((float) c1976f.d) - rectF.top) < Math.abs(((float) c1976f.d) - rectF.bottom)) {
                f6 = (float) c1976f.d;
                f7 = rectF.top;
            } else {
                f6 = (float) c1976f.d;
                f7 = rectF.bottom;
            }
            float f19 = f6 - f7;
            boardView.f3821o.l(f4 - this.c, f19);
            this.c = f4;
            this.d += f19;
            boardView.invalidate();
        }
    }

    public final void b() {
        boolean z4 = this.f14768e;
        BoardView boardView = this.f14770g;
        if (z4) {
            C1995b c1995b = boardView.f3821o;
            float f4 = this.f14766a;
            float f5 = this.f14767b;
            float f6 = this.c;
            float f7 = this.d;
            c1995b.getClass();
            ArrayList arrayList = new ArrayList();
            C1660a c1660a = (C1660a) c1995b.f14886u;
            int size = c1660a.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = c1660a.get(i4);
                i4++;
                j1.c cVar = (j1.c) obj;
                if (cVar instanceof C1729a) {
                    AbstractC1698a abstractC1698a = ((C1729a) cVar).f13326o;
                    if (!(abstractC1698a instanceof Q)) {
                        arrayList.add(Long.valueOf(abstractC1698a.f13117A));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                H0.a aVar = new H0.a(arrayList, f6 - f4, f7 - f5);
                E0.a aVar2 = ((e1.d) c1995b.f14880o).f12684S;
                if (((ArrayList) aVar2.f709q).add(aVar)) {
                    ((ArrayList) aVar2.f710r).clear();
                    aVar2.f707o++;
                    BoardView boardView2 = (BoardView) ((e1.d) aVar2.f711s).f12683R.f14883r;
                    InterfaceC1974d interfaceC1974d = boardView2.f3798D;
                    if (interfaceC1974d != null) {
                        interfaceC1974d.m();
                    }
                    boardView2.invalidate();
                }
            }
            if (c1995b.e()) {
                Q q4 = (Q) ((C1729a) c1660a.get(0)).f13326o;
                ((e1.d) c1995b.f14880o).N(new H0.c(q4.f13117A, AbstractC1895f.h(q4.f14469g0), AbstractC1895f.h(q4.f14468f0)));
                InterfaceC1974d interfaceC1974d2 = ((BoardView) c1995b.f14883r).f3798D;
                if (interfaceC1974d2 != null) {
                    interfaceC1974d2.a();
                }
            }
        }
        this.f14768e = false;
        C1976f c1976f = boardView.f3829w;
        c1976f.f14774f = false;
        c1976f.f14773e = false;
    }
}
