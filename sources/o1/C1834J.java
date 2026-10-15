package o1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ProgrammableArrayView;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramView;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import e1.C1660a;
import e1.EnumC1662c;
import j1.C1729a;
import s1.C1975e;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1834J extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14212b;

    public /* synthetic */ C1834J(View view, int i4) {
        this.f14211a = i4;
        this.f14212b = view;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
        switch (this.f14211a) {
            case 0:
                ProgrammableArrayView programmableArrayView = (ProgrammableArrayView) this.f14212b;
                programmableArrayView.f3695r.fling(programmableArrayView.getScrollX(), programmableArrayView.getScrollY(), (int) (-f4), (int) (-f5), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                programmableArrayView.f3696s.setDuration(programmableArrayView.f3695r.getDuration());
                programmableArrayView.f3696s.start();
                return super.onFling(motionEvent, motionEvent2, f4, f5);
            case 1:
                TimeDiagramView timeDiagramView = (TimeDiagramView) this.f14212b;
                timeDiagramView.f3754r.fling(timeDiagramView.getScrollX(), timeDiagramView.getScrollY(), (int) (-f4), (int) (-f5), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                timeDiagramView.f3755s.setDuration(timeDiagramView.f3754r.getDuration());
                timeDiagramView.f3755s.start();
                return super.onFling(motionEvent, motionEvent2, f4, f5);
            default:
                BoardView boardView = (BoardView) this.f14212b;
                if (boardView.f3828v.f14768e) {
                    return false;
                }
                boardView.f3826t.fling(boardView.getScrollX(), boardView.getScrollY(), (int) (-f4), (int) (-f5), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                boardView.f3827u.setDuration(boardView.f3826t.getDuration());
                boardView.f3827u.start();
                return super.onFling(motionEvent, motionEvent2, f4, f5);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        j1.c Q3;
        switch (this.f14211a) {
            case 2:
                float x4 = motionEvent.getX();
                BoardView boardView = (BoardView) this.f14212b;
                float scrollX = (x4 + boardView.getScrollX()) / boardView.f3825s;
                float f4 = boardView.f3830x;
                float f5 = scrollX / f4;
                float y = ((motionEvent.getY() + boardView.getScrollY()) / boardView.f3825s) / f4;
                C1995b c1995b = boardView.f3821o;
                int i4 = (int) f5;
                int i5 = (int) y;
                BoardView boardView2 = (BoardView) c1995b.f14883r;
                C1660a c1660a = (C1660a) c1995b.f14886u;
                EnumC1662c enumC1662c = (EnumC1662c) c1995b.f14887v;
                if (enumC1662c == EnumC1662c.f12675o) {
                    j1.c Q4 = ((e1.d) c1995b.f14880o).Q(i4, i5);
                    if (Q4 != null && (Q4 instanceof C1729a)) {
                        c1660a.clear();
                        c1660a.add(Q4);
                        boardView2.o();
                        boardView.invalidate();
                    }
                    boardView.f3815V = true;
                    return;
                }
                if (enumC1662c == EnumC1662c.f12677q && (Q3 = ((e1.d) c1995b.f14880o).Q(i4, i5)) != null && (Q3 instanceof C1729a)) {
                    int size = c1660a.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            Object obj = c1660a.get(i6);
                            i6++;
                            if (((j1.c) obj).a() == Q3.a()) {
                                boardView2.o();
                            }
                        } else {
                            c1660a.add(Q3);
                            boardView2.o();
                        }
                    }
                    boardView.invalidate();
                }
                boardView.f3815V = true;
                return;
            default:
                super.onLongPress(motionEvent);
                return;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
        switch (this.f14211a) {
            case 0:
                ProgrammableArrayView programmableArrayView = (ProgrammableArrayView) this.f14212b;
                if (!programmableArrayView.f3701x) {
                    f4 += programmableArrayView.f3699v - programmableArrayView.f3697t;
                    f5 += programmableArrayView.f3700w - programmableArrayView.f3698u;
                    programmableArrayView.f3701x = true;
                }
                programmableArrayView.scrollBy((int) f4, (int) f5);
                return true;
            case 1:
                TimeDiagramView timeDiagramView = (TimeDiagramView) this.f14212b;
                if (!timeDiagramView.f3760x) {
                    timeDiagramView.y = Math.abs(f4) > Math.abs(f5) * 2.0f;
                    f4 += timeDiagramView.f3758v - timeDiagramView.f3756t;
                    f5 += timeDiagramView.f3759w - timeDiagramView.f3757u;
                    timeDiagramView.f3760x = true;
                }
                int i4 = (int) f4;
                int i5 = (int) f5;
                timeDiagramView.scrollBy(i4, i5);
                if (!timeDiagramView.y) {
                    timeDiagramView.startNestedScroll(2);
                    int[] iArr = timeDiagramView.f3750M;
                    timeDiagramView.dispatchNestedScroll(0, 0, 0, i5 - iArr[1], iArr);
                }
                return true;
            default:
                BoardView boardView = (BoardView) this.f14212b;
                float f6 = boardView.f3830x;
                C1975e c1975e = boardView.f3828v;
                if (!boardView.f3812S) {
                    f4 += boardView.f3810Q - boardView.f3808O;
                    f5 += boardView.f3811R - boardView.f3809P;
                    boardView.f3812S = true;
                }
                if (c1975e.f14768e) {
                    float x4 = ((motionEvent2.getX() + boardView.getScrollX()) / boardView.f3825s) / f6;
                    float y = ((motionEvent2.getY() + boardView.getScrollY()) / boardView.f3825s) / f6;
                    if (boardView.f3814U || Math.abs(boardView.f3810Q - boardView.f3808O) > boardView.f3813T || Math.abs(boardView.f3811R - boardView.f3809P) > boardView.f3813T) {
                        c1975e.a(x4, y);
                        boardView.f3814U = true;
                    }
                } else {
                    boardView.scrollBy((int) f4, (int) f5);
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f14211a) {
            case 0:
                ProgrammableArrayView programmableArrayView = (ProgrammableArrayView) this.f14212b;
                if (!programmableArrayView.f3690G) {
                    float x4 = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f4 = programmableArrayView.f3688E;
                    if (x4 >= f4 && y >= f4) {
                        int scrollX = ((int) (((programmableArrayView.getScrollX() + x4) / programmableArrayView.f3694q) / programmableArrayView.f3688E)) - 1;
                        int scrollY = ((int) (((programmableArrayView.getScrollY() + y) / programmableArrayView.f3694q) / programmableArrayView.f3688E)) - 1;
                        if (scrollX >= 0) {
                            boolean[][] zArr = programmableArrayView.f3691H;
                            if (scrollX < zArr[0].length && scrollY >= 0 && scrollY < zArr.length) {
                                zArr[scrollY][scrollX] = !r6[scrollX];
                                programmableArrayView.invalidate();
                            }
                        }
                    }
                }
                return true;
            case 1:
                ((TimeDiagramView) this.f14212b).getClass();
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
