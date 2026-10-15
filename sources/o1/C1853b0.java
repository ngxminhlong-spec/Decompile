package o1;

import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramListLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1853b0 extends b0.c0 {

    /* renamed from: A, reason: collision with root package name */
    public final Switch f14249A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ TimeDiagramListLayout f14250B;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f14251t;

    /* renamed from: u, reason: collision with root package name */
    public final View f14252u;

    /* renamed from: v, reason: collision with root package name */
    public final View f14253v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f14254w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f14255x;
    public final TextView y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f14256z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1853b0(TimeDiagramListLayout timeDiagramListLayout, View view) {
        super(view);
        this.f14250B = timeDiagramListLayout;
        this.f14251t = (TextView) view.findViewById(R.id.timediagram_name);
        this.f14252u = view.findViewById(R.id.timediagram_delete);
        this.f14253v = view.findViewById(R.id.timediagram_rename);
        this.f14254w = (TextView) view.findViewById(R.id.timediagram_entries);
        this.f14255x = (TextView) view.findViewById(R.id.timediagram_entries_num);
        this.y = (TextView) view.findViewById(R.id.timediagram_steps);
        this.f14256z = (TextView) view.findViewById(R.id.timediagram_lenght);
        this.f14249A = (Switch) view.findViewById(R.id.timediagram_show_pins);
    }
}
