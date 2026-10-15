package C0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e0 extends b0.c0 {

    /* renamed from: A, reason: collision with root package name */
    public final View f298A;

    /* renamed from: B, reason: collision with root package name */
    public final View f299B;

    /* renamed from: C, reason: collision with root package name */
    public final View f300C;

    /* renamed from: D, reason: collision with root package name */
    public final View f301D;

    /* renamed from: E, reason: collision with root package name */
    public final View f302E;

    /* renamed from: F, reason: collision with root package name */
    public final View f303F;

    /* renamed from: G, reason: collision with root package name */
    public final View f304G;

    /* renamed from: t, reason: collision with root package name */
    public final View f305t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f306u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f307v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f308w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f309x;
    public final View y;

    /* renamed from: z, reason: collision with root package name */
    public final View f310z;

    public e0(View view) {
        super(view);
        new DecelerateInterpolator(2.0f);
        this.f306u = (TextView) view.findViewById(R.id.project_name);
        this.f307v = (TextView) view.findViewById(R.id.elem_num);
        this.f308w = (TextView) view.findViewById(R.id.conn_num);
        this.f309x = (TextView) view.findViewById(R.id.date_modified);
        this.y = view.findViewById(R.id.project_delete_dim);
        this.f310z = view.findViewById(R.id.project_delete_dim_delete);
        this.f298A = view.findViewById(R.id.project_delete_dim_cancel);
        this.f300C = view.findViewById(R.id.recents_item_available_io);
        this.f301D = view.findViewById(R.id.recent_item_has_timediagrams);
        this.f302E = view.findViewById(R.id.recent_item_more);
        this.f305t = view.findViewById(R.id.bottom_view);
        this.f299B = view.findViewById(R.id.project_delete_dim_rename);
        this.f304G = view.findViewById(R.id.ic_image_downloaded);
        this.f303F = view.findViewById(R.id.ic_image);
    }

    public final void r(boolean z4) {
        int height = this.f3244a.getHeight();
        View view = this.f305t;
        int paddingTop = view.getPaddingTop();
        if (!z4 || paddingTop <= 0) {
            if (z4 || paddingTop != 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(300L);
                if (z4) {
                    view.setVisibility(0);
                }
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new d0(paddingTop, height, 0, view, z4));
                ofFloat.start();
            }
        }
    }
}
