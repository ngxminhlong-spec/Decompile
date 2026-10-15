package D0;

import C0.d0;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import b0.c0;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m extends c0 {

    /* renamed from: A, reason: collision with root package name */
    public final View f598A;

    /* renamed from: B, reason: collision with root package name */
    public final View f599B;

    /* renamed from: C, reason: collision with root package name */
    public final View f600C;

    /* renamed from: D, reason: collision with root package name */
    public final View f601D;

    /* renamed from: E, reason: collision with root package name */
    public final View f602E;

    /* renamed from: t, reason: collision with root package name */
    public final View f603t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f604u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f605v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f606w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f607x;
    public final View y;

    /* renamed from: z, reason: collision with root package name */
    public final View f608z;

    public m(View view) {
        super(view);
        new DecelerateInterpolator(2.0f);
        this.f604u = (TextView) view.findViewById(R.id.project_name);
        this.f605v = (TextView) view.findViewById(R.id.elem_num);
        this.f606w = (TextView) view.findViewById(R.id.conn_num);
        this.f607x = (TextView) view.findViewById(R.id.date_modified);
        this.y = view.findViewById(R.id.project_delete_dim);
        this.f608z = view.findViewById(R.id.project_delete_dim_delete);
        this.f598A = view.findViewById(R.id.project_delete_dim_cancel);
        this.f600C = view.findViewById(R.id.recents_item_available_io);
        this.f601D = view.findViewById(R.id.recent_item_has_timediagrams);
        this.f602E = view.findViewById(R.id.recent_item_more);
        this.f603t = view.findViewById(R.id.bottom_view);
        this.f599B = view.findViewById(R.id.project_delete_dim_rename);
    }

    public final void r(boolean z4) {
        int height = this.f3244a.getHeight();
        View view = this.f603t;
        int paddingTop = view.getPaddingTop();
        if (!z4 || paddingTop <= 0) {
            if (z4 || paddingTop != 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(300L);
                if (z4) {
                    view.setVisibility(0);
                }
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new d0(paddingTop, height, 1, view, z4));
                ofFloat.start();
            }
        }
    }
}
