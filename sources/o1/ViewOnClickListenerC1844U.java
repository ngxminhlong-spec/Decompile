package o1;

import android.view.View;
import android.widget.Toast;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1844U implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14229o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TimeDiagramLayout f14230p;

    public /* synthetic */ ViewOnClickListenerC1844U(TimeDiagramLayout timeDiagramLayout, int i4) {
        this.f14229o = i4;
        this.f14230p = timeDiagramLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14229o) {
            case 0:
                this.f14230p.f3726p.a();
                return;
            case 1:
                TimeDiagramLayout timeDiagramLayout = this.f14230p;
                if (timeDiagramLayout.f3725o.d.isEmpty()) {
                    Toast.makeText(timeDiagramLayout.getContext(), R.string.no_entries_nothing_to_record, 1).show();
                    return;
                } else {
                    timeDiagramLayout.f3726p.e(timeDiagramLayout.f3725o);
                    return;
                }
            case 2:
                this.f14230p.f3726p.h();
                return;
            case 3:
                this.f14230p.f3726p.d();
                return;
            case 4:
                this.f14230p.f3728r.b(true);
                return;
            case 5:
                this.f14230p.f3728r.b(false);
                return;
            default:
                this.f14230p.f3726p.b();
                return;
        }
    }
}
