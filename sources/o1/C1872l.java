package o1;

import android.view.View;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.GoPremiumLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1872l extends b0.c0 {

    /* renamed from: A, reason: collision with root package name */
    public final View f14273A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f14274B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f14275C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ GoPremiumLayout f14276D;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f14277t;

    /* renamed from: u, reason: collision with root package name */
    public final View f14278u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f14279v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f14280w;

    /* renamed from: x, reason: collision with root package name */
    public final View f14281x;
    public final View y;

    /* renamed from: z, reason: collision with root package name */
    public final View f14282z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1872l(GoPremiumLayout goPremiumLayout, View view) {
        super(view);
        this.f14276D = goPremiumLayout;
        this.f14277t = (TextView) view.findViewById(R.id.price_text);
        this.f14278u = view.findViewById(R.id.price_container);
        this.f14279v = (TextView) view.findViewById(R.id.price_type_text);
        this.f14281x = view.findViewById(R.id.price_checked);
        this.f14280w = (TextView) view.findViewById(R.id.price_type_additional_text);
        this.y = view.findViewById(R.id.popular);
        this.f14282z = view.findViewById(R.id.discount_container);
        this.f14273A = view.findViewById(R.id.discount_container2);
        this.f14274B = (TextView) view.findViewById(R.id.discount_text);
        this.f14275C = (TextView) view.findViewById(R.id.offer_ends_text);
    }
}
