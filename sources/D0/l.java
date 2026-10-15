package D0;

import C0.C0001a0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b0.c0;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import d1.C1650a;
import d3.AbstractC1654b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l extends c0 {

    /* renamed from: A, reason: collision with root package name */
    public final View f590A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0001a0 f591B;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f592t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f593u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f594v;

    /* renamed from: w, reason: collision with root package name */
    public final View f595w;

    /* renamed from: x, reason: collision with root package name */
    public final View f596x;
    public final ViewGroup y;

    /* renamed from: z, reason: collision with root package name */
    public final ViewGroup f597z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C0001a0 c0001a0, View view) {
        super(view);
        this.f591B = c0001a0;
        this.f592t = (TextView) view.findViewById(R.id.title);
        this.f593u = (TextView) view.findViewById(R.id.description);
        this.f594v = (ImageView) view.findViewById(R.id.icon);
        this.f595w = view.findViewById(R.id.expand);
        this.f596x = view.findViewById(R.id.collapse);
        this.y = (ViewGroup) view.findViewById(R.id.container);
        this.f597z = (ViewGroup) view.findViewById(R.id.container_container);
        this.f590A = view.findViewById(R.id.header);
    }

    public final void r(C1650a c1650a, boolean z4) {
        this.f597z.setVisibility(z4 ? 0 : 8);
        if (z4) {
            ViewGroup viewGroup = this.y;
            viewGroup.removeAllViews();
            viewGroup.addView(AbstractC1654b.B(viewGroup, c1650a));
        }
        int i4 = z4 ? 8 : 0;
        View view = this.f595w;
        view.setVisibility(i4);
        int i5 = z4 ? 0 : 8;
        View view2 = this.f596x;
        view2.setVisibility(i5);
        if (this.f591B.f274p) {
            view.setVisibility(8);
            view2.setVisibility(8);
        }
    }
}
