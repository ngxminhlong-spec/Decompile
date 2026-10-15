package o1;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1889z implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1827C f14314b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ C1889z(InterfaceC1827C interfaceC1827C, ViewGroup viewGroup, int i4) {
        this.f14313a = i4;
        this.f14314b = interfaceC1827C;
        this.c = viewGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
        switch (this.f14313a) {
            case 0:
                this.f14314b.i(z4);
                ((TextView) this.c.findViewById(R.id.grid_visible)).setText(z4 ? R.string.on : R.string.off);
                return;
            default:
                this.f14314b.e(z4);
                ((TextView) this.c.findViewById(R.id.labels_visibility_text)).setText(z4 ? R.string.on : R.string.off);
                return;
        }
    }
}
