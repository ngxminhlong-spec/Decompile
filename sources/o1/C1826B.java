package o1;

import android.widget.RadioGroup;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1826B implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1827C f14203a;

    public C1826B(InterfaceC1827C interfaceC1827C) {
        this.f14203a = interfaceC1827C;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i4) {
        InterfaceC1827C interfaceC1827C = this.f14203a;
        if (i4 == R.id.mm_toggle) {
            interfaceC1827C.p(1);
        } else if (i4 == R.id.inches_toggle) {
            interfaceC1827C.p(2);
        }
    }
}
