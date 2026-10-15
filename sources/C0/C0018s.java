package C0;

import com.duracodefactory.logiccircuitsimulatorpro.ui.ColorPicker;
import o1.InterfaceC1858e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018s implements InterfaceC1858e {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f384o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ColorPicker f385p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int[] f386q;

    public /* synthetic */ C0018s(ColorPicker colorPicker, int[] iArr, int i4) {
        this.f384o = i4;
        this.f385p = colorPicker;
        this.f386q = iArr;
    }

    @Override // o1.InterfaceC1858e
    public final void d(int i4) {
        switch (this.f384o) {
            case 0:
                this.f385p.setSelectedColor(i4);
                this.f386q[0] = i4;
                return;
            default:
                this.f385p.setSelectedColor(i4);
                this.f386q[0] = i4;
                return;
        }
    }
}
