package com.duracodefactory.logiccircuitsimulatorpro.ui;

import H1.a;
import J2.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import g2.x;
import java.util.ArrayList;
import m1.InterfaceC1805a;
import m1.b;
import m1.c;
import o1.C1881r;
import o1.InterfaceC1847X;
import o1.ViewOnClickListenerC1844U;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class TimeDiagramLayout extends FrameLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f3724x = 0;

    /* renamed from: o, reason: collision with root package name */
    public b f3725o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC1847X f3726p;

    /* renamed from: q, reason: collision with root package name */
    public C1881r f3727q;

    /* renamed from: r, reason: collision with root package name */
    public TimeDiagramView f3728r;

    /* renamed from: s, reason: collision with root package name */
    public View f3729s;

    /* renamed from: t, reason: collision with root package name */
    public Switch f3730t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f3731u;

    /* renamed from: v, reason: collision with root package name */
    public View f3732v;

    /* renamed from: w, reason: collision with root package name */
    public ScrollView f3733w;

    public TimeDiagramLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final Bitmap a(int i4) {
        this.f3728r.invalidate();
        this.f3728r.requestLayout();
        TimeDiagramView timeDiagramView = this.f3728r;
        int height = timeDiagramView.getHeight() + 450;
        int i5 = 4000;
        if (height > 4000) {
            float f4 = 4000;
            i5 = (int) (f4 / (height / f4));
            height = 4000;
        }
        while (true) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(i5, height, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(i4);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(100.0f, 250.0f);
                Paint paint = new Paint();
                paint.setTextSize(150.0f);
                paint.setColor(timeDiagramView.getContext().getColor(R.color.icons_dark));
                paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                canvas.drawText(timeDiagramView.f3749L, 0.0f, 0.0f, paint);
                canvas.translate(100.0f, 100.0f);
                timeDiagramView.setScale((i5 - 400) / timeDiagramView.getWidth());
                timeDiagramView.scrollTo(0, 0);
                timeDiagramView.onDraw(canvas);
                timeDiagramView.setScale(1.0f);
                return createBitmap;
            } catch (OutOfMemoryError unused) {
                i5 /= 2;
                height /= 2;
            }
        }
    }

    public final void b(InterfaceC1805a interfaceC1805a) {
        b bVar = this.f3725o;
        ArrayList arrayList = bVar.d;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            c cVar = (c) obj;
            boolean j4 = interfaceC1805a.j(cVar.d);
            ArrayList arrayList2 = cVar.f13990e;
            if (arrayList2.isEmpty()) {
                arrayList2.add(0);
            }
            if (j4 == cVar.f13991f) {
                arrayList2.add(Integer.valueOf(((Integer) arrayList2.remove(arrayList2.size() - 1)).intValue() + 1));
            } else {
                arrayList2.add(0);
            }
            cVar.f13991f = j4;
        }
        bVar.f13987f++;
    }

    public b getTimeDiagram() {
        return this.f3725o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.timediagram_layout_new).setOnClickListener(new ViewOnClickListenerC1844U(this, 1));
        findViewById(R.id.timediagram_layout_add_node).setOnClickListener(new ViewOnClickListenerC1844U(this, 2));
        findViewById(R.id.timediagram_layout_back_arrow).setOnClickListener(new ViewOnClickListenerC1844U(this, 3));
        RecentsRecyclerView recentsRecyclerView = (RecentsRecyclerView) findViewById(R.id.timediagram_layout_entries_rv);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager();
        this.f3727q = new C1881r(this);
        recentsRecyclerView.setListener(new a(this, recentsRecyclerView, getContext().getResources().getDimensionPixelSize(R.dimen.timediagram_entry_size), gridLayoutManager));
        getContext();
        recentsRecyclerView.setLayoutManager(new LinearLayoutManager(1));
        recentsRecyclerView.setAdapter(this.f3727q);
        this.f3728r = (TimeDiagramView) findViewById(R.id.timediagram_layout_time_view);
        this.f3729s = findViewById(R.id.timediagram_layout_time_view_container);
        findViewById(R.id.timediagram_zoom_in).setOnClickListener(new ViewOnClickListenerC1844U(this, 4));
        findViewById(R.id.timediagram_zoom_out).setOnClickListener(new ViewOnClickListenerC1844U(this, 5));
        Switch r02 = (Switch) findViewById(R.id.timediagram_layout_show_pins);
        this.f3730t = r02;
        r02.setOnCheckedChangeListener(new f(3, this));
        this.f3731u = (TextView) findViewById(R.id.timing_diagram_layout_length);
        this.f3732v = findViewById(R.id.timediagram_layout_export_as_image);
        this.f3733w = (ScrollView) findViewById(R.id.timediagram_layout_scrollView);
        this.f3732v.setOnClickListener(new ViewOnClickListenerC1844U(this, 6));
        findViewById(R.id.io_timediagram_help_button).setOnClickListener(new ViewOnClickListenerC1844U(this, 0));
    }

    public void setListener(InterfaceC1847X interfaceC1847X) {
        this.f3726p = interfaceC1847X;
    }

    public void setTimeDiagram(b bVar) {
        this.f3725o = bVar;
        if (bVar == null) {
            return;
        }
        ((TextView) findViewById(R.id.timediagram_layout_time_diagram_name)).setText(bVar.f13985b);
        C1881r c1881r = this.f3727q;
        ArrayList arrayList = bVar.d;
        c1881r.d = arrayList;
        c1881r.d();
        TimeDiagramLayout timeDiagramLayout = (TimeDiagramLayout) c1881r.f14299e;
        TimeDiagramView timeDiagramView = timeDiagramLayout.f3728r;
        b bVar2 = timeDiagramLayout.f3725o;
        timeDiagramView.a(arrayList, bVar2.f13987f, bVar2.c, bVar2.f13985b);
        timeDiagramLayout.f3728r.invalidate();
        if (this.f3725o.d.isEmpty()) {
            this.f3729s.setVisibility(8);
        } else {
            this.f3729s.setVisibility(0);
        }
        this.f3730t.setChecked(bVar.f13986e);
        this.f3731u.setText(AbstractC1895f.q(bVar.c * bVar.f13987f));
        this.f3732v.setVisibility(bVar.f13987f == 0 ? 8 : 0);
        this.f3728r.invalidate();
        this.f3728r.requestLayout();
        this.f3733w.post(new x(9, this));
    }
}
