package C0;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.NumberPicker;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import e1.EnumC1662c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p1.C1939z;
import q1.AbstractC1955j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0020u implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f403o;

    /* renamed from: p, reason: collision with root package name */
    public Object f404p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f405q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f406r;

    /* renamed from: s, reason: collision with root package name */
    public Object f407s;

    public /* synthetic */ ViewOnClickListenerC0020u(H h4, Object obj, Object obj2, Object obj3, int i4) {
        this.f403o = i4;
        this.f404p = h4;
        this.f405q = obj;
        this.f406r = obj2;
        this.f407s = obj3;
    }

    public ViewOnClickListenerC0020u(View view, String str) {
        this.f403o = 4;
        this.f405q = view;
        this.f406r = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        int i4 = this.f403o;
        EnumC1662c enumC1662c = EnumC1662c.f12679s;
        Object obj = this.f406r;
        Object obj2 = this.f405q;
        switch (i4) {
            case 0:
                C1939z c1939z = (C1939z) obj2;
                H0.e eVar = new H0.e(c1939z.f13117A, c1939z.f14600R, ((float[]) obj)[((NumberPicker) this.f407s).getSelection()]);
                D d = (D) this.f404p;
                d.f202i0.d(eVar);
                d.a0();
                d.p0();
                String.valueOf(n0.a.e(5));
                return;
            case 1:
                View view2 = (View) obj;
                D d4 = (D) this.f404p;
                String.valueOf(n0.a.e(2));
                View view3 = (View) obj2;
                if (view3.getVisibility() == 8) {
                    return;
                }
                d4.f173F0.setVisibility(8);
                d4.s0(R.string.recording_timediagram);
                view3.setVisibility(8);
                d4.f170C0.findViewById(R.id.timediagram_recording_rec).setVisibility(0);
                view2.setVisibility(0);
                view2.setOnClickListener(new ViewOnClickListenerC0022w(0, this));
                m1.b bVar = (m1.b) this.f407s;
                d4.j0(enumC1662c);
                bVar.f13987f = 0;
                ArrayList arrayList = bVar.d;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj3 = arrayList.get(i5);
                    i5++;
                    m1.c cVar = (m1.c) obj3;
                    cVar.f13991f = false;
                    cVar.f13990e.clear();
                }
                d4.f208l1 = 0;
                d4.f210m1 = 0.0f;
                d4.k1 = true;
                BoardView boardView = d4.f202i0;
                f1.b bVar2 = boardView.f3807M;
                bVar2.f12960g = true;
                if (!bVar2.f12956a) {
                    bVar2.a(null);
                }
                e1.f fVar = boardView.f3806L;
                fVar.f12703g = 0L;
                fVar.f12705i = true;
                fVar.f12706j = 0L;
                float timeDiagramSlowDownFactor = d4.f202i0.getTimeDiagramSlowDownFactor();
                float f4 = timeDiagramSlowDownFactor == 0.0f ? 1.0f : timeDiagramSlowDownFactor;
                int i6 = AbstractC1955j.f14675a;
                float f5 = (16 * 1000.0f) / f4;
                d4.f212n1 = f5;
                bVar.c = f5;
                d4.g0();
                return;
            case 2:
                C1939z c1939z2 = (C1939z) obj2;
                H0.e eVar2 = new H0.e(c1939z2.f13117A, c1939z2.f14600R, ((float[]) obj)[((NumberPicker) this.f407s).getSelection()]);
                D0.g gVar = (D0.g) this.f404p;
                gVar.f566h0.d(eVar2);
                gVar.Z();
                return;
            case 3:
                View view4 = (View) obj;
                D0.g gVar2 = (D0.g) this.f404p;
                View view5 = (View) obj2;
                if (view5.getVisibility() == 8) {
                    return;
                }
                gVar2.f584z0.setVisibility(8);
                gVar2.l0(R.string.recording_timediagram);
                view5.setVisibility(8);
                gVar2.f581w0.findViewById(R.id.timediagram_recording_rec).setVisibility(0);
                view4.setVisibility(0);
                view4.setOnClickListener(new ViewOnClickListenerC0022w(5, this));
                m1.b bVar3 = (m1.b) this.f407s;
                gVar2.h0(enumC1662c);
                bVar3.f13987f = 0;
                ArrayList arrayList2 = bVar3.d;
                int size2 = arrayList2.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj4 = arrayList2.get(i7);
                    i7++;
                    m1.c cVar2 = (m1.c) obj4;
                    cVar2.f13991f = false;
                    cVar2.f13990e.clear();
                }
                gVar2.f559U0 = 0;
                gVar2.f560V0 = 0.0f;
                gVar2.f558T0 = true;
                BoardView boardView2 = gVar2.f566h0;
                f1.b bVar4 = boardView2.f3807M;
                bVar4.f12960g = true;
                if (!bVar4.f12956a) {
                    bVar4.a(null);
                }
                e1.f fVar2 = boardView2.f3806L;
                fVar2.f12703g = 0L;
                fVar2.f12705i = true;
                fVar2.f12706j = 0L;
                float timeDiagramSlowDownFactor2 = gVar2.f566h0.getTimeDiagramSlowDownFactor();
                float f6 = timeDiagramSlowDownFactor2 == 0.0f ? 1.0f : timeDiagramSlowDownFactor2;
                int i8 = AbstractC1955j.f14675a;
                float f7 = (16 * 1000.0f) / f6;
                gVar2.f561W0 = f7;
                bVar3.c = f7;
                gVar2.e0();
                return;
            default:
                View view6 = (View) obj2;
                if (((Method) this.f407s) == null) {
                    Context context = view6.getContext();
                    String str2 = (String) obj;
                    while (context != null) {
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                                this.f407s = method;
                                this.f404p = context;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                        context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                    }
                    int id = view6.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view6.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view6.getClass() + str);
                }
                try {
                    ((Method) this.f407s).invoke((Context) this.f404p, view);
                    return;
                } catch (IllegalAccessException e4) {
                    throw new IllegalStateException("Could not execute non-public method for android:onClick", e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException("Could not execute method for android:onClick", e5);
                }
        }
    }
}
